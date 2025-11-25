import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class OficinaMain {

    static Scanner sc = new Scanner(System.in);        // Entrada
    static ArrayList<Veiculo> veiculos = new ArrayList<>(); // Lista
    static int contadorId = 1;                         // Controle ID

    public static void main(String[] args) {
        int opc;

        do {
            System.out.println("\n===== SISTEMA DE OFICINA =====");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Atualizar veículo");
            System.out.println("4 - Excluir veículo");
            System.out.println("5 - Salvar em arquivo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> cadastrarVeiculo();   // Cadastro
                case 2 -> listarVeiculos();     // Listar
                case 3 -> atualizarVeiculo();   // Atualizar
                case 4 -> excluirVeiculo();     // Excluir
                case 5 -> salvarEmArquivo();    // Salvar txt
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }

    // Cadastro simples
    public static void cadastrarVeiculo() {
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();

        Veiculo v = new Veiculo(contadorId++, marca, modelo, ano);
        veiculos.add(v);

        System.out.println("Veículo cadastrado!");
    }

    // Listagem da lista
    public static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    // Atualização por ID
    public static void atualizarVeiculo() {
        System.out.print("ID para atualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                System.out.print("Nova marca: ");
                v.setMarca(sc.nextLine());
                System.out.print("Novo modelo: ");
                v.setModelo(sc.nextLine());
                System.out.print("Novo ano: ");
                v.setAno(sc.nextInt());

                System.out.println("Atualizado!");
                return;
            }
        }
        System.out.println("ID não encontrado.");
    }

    // Remoção por ID
    public static void excluirVeiculo() {
        System.out.print("ID para excluir: ");
        int id = sc.nextInt();

        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                veiculos.remove(v);
                System.out.println("Veículo removido!");
                return;
            }
        }
        System.out.println("ID não encontrado.");
    }

    // Salva todos os veículos em arquivo.txt
    public static void salvarEmArquivo() {
        try {
            FileWriter fw = new FileWriter("veiculos.txt");

            for (Veiculo v : veiculos) {
                fw.write(v.toString() + "\n"); // Escreve cada veículo
            }

            fw.close();
            System.out.println("Arquivo salvo como 'veiculos.txt'!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}
