import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OficinaMain {

    // SALVAR LISTA NO ARQUIVO TXT

    public static void salvarArquivo(ArrayList<Veiculo> lista) {
        try {
            FileWriter fw = new FileWriter("bancodedados.txt");

            for (Veiculo v : lista) {
                fw.write(
                        v.getId() + ";" +
                                v.getClass().getSimpleName() + ";" +
                                v.getMarca() + ";" +
                                v.getModelo() + ";" +
                                v.getAno() + ";" +
                                v.getProblema() +
                                "\n"
                );
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    // CARREGAR DADOS DO ARQUIVO TXT

    public static int carregarArquivo(ArrayList<Veiculo> lista) {
        int maiorId = 0;

        try {
            File file = new File("bancodedados.txt");
            if (!file.exists()) {
                return 1;
            }

            Scanner leitor = new Scanner(file);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] partes = linha.split(";");

                int id = Integer.parseInt(partes[0]);
                String tipo = partes[1];
                String marca = partes[2];
                String modelo = partes[3];
                int ano = Integer.parseInt(partes[4]);
                String problema = partes[5];

                Veiculo v;

                if (tipo.equals("Carro")) {
                    v = new Carro(id, marca, modelo, ano, problema);
                } else {
                    v = new Moto(id, marca, modelo, ano, problema);
                }

                lista.add(v);

                if (id > maiorId) maiorId = id;
            }

            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo.");
        }

        return maiorId + 1;
    }


    // PROGRAMA PRINCIPAL

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();

        // Carregar dados salvos
        int idContador = carregarArquivo(lista);

        int opcao;

        do {
            System.out.println("\n===== OFICINA =====");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Listar Veículos");
            System.out.println("4 - Emitir Som de um Veículo");
            System.out.println("5 - Excluir Veículo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Marca: ");
                    String marcaC = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modeloC = sc.nextLine();
                    System.out.print("Ano: ");
                    int anoC = sc.nextInt(); sc.nextLine();
                    System.out.print("Problema: ");
                    String problemaC = sc.nextLine();

                    lista.add(new Carro(idContador++, marcaC, modeloC, anoC, problemaC));
                    salvarArquivo(lista);
                    System.out.println("Carro cadastrado!");
                    break;

                case 2:
                    System.out.print("Marca: ");
                    String marcaM = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modeloM = sc.nextLine();
                    System.out.print("Ano: ");
                    int anoM = sc.nextInt(); sc.nextLine();
                    System.out.print("Problema: ");
                    String problemaM = sc.nextLine();

                    lista.add(new Moto(idContador++, marcaM, modeloM, anoM, problemaM));
                    salvarArquivo(lista);
                    System.out.println("Moto cadastrada!");
                    break;

                case 3:
                    if (lista.isEmpty())
                        System.out.println("Nenhum veículo cadastrado.");
                    else {
                        System.out.println("\n=== VEÍCULOS ===");
                        for (Veiculo v : lista) System.out.println(v);
                    }
                    break;

                case 4:
                    System.out.print("ID do veículo: ");
                    int idSom = sc.nextInt();

                    Veiculo achadoSom = null;
                    for (Veiculo v : lista)
                        if (v.getId() == idSom) achadoSom = v;

                    if (achadoSom == null)
                        System.out.println("Veículo não encontrado.");
                    else
                        System.out.println("Som: " + achadoSom.emitirSom());
                    break;

                case 5:
                    System.out.print("ID para excluir: ");
                    int idExc = sc.nextInt();

                    Veiculo achadoExc = null;
                    for (Veiculo v : lista)
                        if (v.getId() == idExc) achadoExc = v;

                    if (achadoExc == null)
                        System.out.println("Veículo não encontrado.");
                    else {
                        lista.remove(achadoExc);
                        salvarArquivo(lista);
                        System.out.println("Veículo removido!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
