import java.util.ArrayList;
import java.util.Scanner;

// Programa principal
public class OficinaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();
        int opcao;
        int idContador = 1;

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

                case 1: // cadastrar carro
                    System.out.print("Marca: ");
                    String marcaC = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modeloC = sc.nextLine();
                    System.out.print("Ano: ");
                    int anoC = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Problema: ");
                    String problemaC = sc.nextLine();

                    lista.add(new Carro(idContador++, marcaC, modeloC, anoC, problemaC));
                    System.out.println("Carro cadastrado!");
                    break;

                case 2: // cadastrar moto
                    System.out.print("Marca: ");
                    String marcaM = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modeloM = sc.nextLine();
                    System.out.print("Ano: ");
                    int anoM = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Problema: ");
                    String problemaM = sc.nextLine();

                    lista.add(new Moto(idContador++, marcaM, modeloM, anoM, problemaM));
                    System.out.println("Moto cadastrada!");
                    break;

                case 3: // listar
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado.");
                    } else {
                        System.out.println("\n=== VEÍCULOS ===");
                        for (Veiculo v : lista) {
                            System.out.println(v);
                        }
                    }
                    break;

                case 4: // emitir som
                    System.out.print("ID do veículo: ");
                    int idSom = sc.nextInt();

                    Veiculo achadoSom = null;
                    for (Veiculo v : lista) {
                        if (v.getId() == idSom) {
                            achadoSom = v;
                            break;
                        }
                    }

                    if (achadoSom == null) {
                        System.out.println("Veículo não encontrado.");
                    } else {
                        System.out.println("Som: " + achadoSom.emitirSom());
                    }
                    break;

                case 5: // excluir
                    System.out.print("ID para excluir: ");
                    int idExc = sc.nextInt();

                    Veiculo achadoExc = null;
                    for (Veiculo v : lista) {
                        if (v.getId() == idExc) {
                            achadoExc = v;
                            break;
                        }
                    }

                    if (achadoExc == null) {
                        System.out.println("Veículo não encontrado.");
                    } else {
                        lista.remove(achadoExc);
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