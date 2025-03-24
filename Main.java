import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Condominio condominio = new Condominio();
        while (true) {
            System.out.println("+---------------------------------+");
            System.out.println("|   BEM-VINDO AO HIGHCONDOMINIO   |");
            System.out.println("+---------------------------------+");
            System.out.println("| 1. Cadastrar Condominio         |");
            System.out.println("| 2. Cadastrar Proprietario       |");
            System.out.println("| 3. Cadastrar Unidade            |");
            System.out.println("| 4. Consultar                    |");
            System.out.println("| 5. Sair                         |");
            System.out.println("+---------------------------------+");
            System.out.print("Selecione uma opção: ");
            int opcao_menu = sc.nextInt();
            sc.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if (opcao_menu == 1) {
                condominio.cadastrarCondominio();
            } else if (opcao_menu == 2) {
                Proprietario.cadastrarProprietario(condominio);
            } else if (opcao_menu == 3) {
                Unidade.cadastrarUnidade(condominio);
            } else if (opcao_menu == 4) {
                while (true) {
                    System.out.println("+---------------------------------+");
                    System.out.println("|      CONSULTAR INFORMAÇÕES      |");
                    System.out.println("+---------------------------------+");
                    System.out.println("| 1. Condominio                   |");
                    System.out.println("| 2. Proprietarios                |");
                    System.out.println("| 3. Unidades                     |");
                    System.out.println("| 4. Sair                         |");
                    System.out.println("+---------------------------------+");
                    System.out.print("Selecione uma opção: ");
                    int opcao_consulta = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    if (opcao_consulta == 1) {
                        condominio.mostrarCondominio();
                    } else if (opcao_consulta == 2) {
                        Proprietario.mostrarProprietarios(condominio);
                    } else if (opcao_consulta == 3) {
                        Unidade.mostrarUnidades(condominio);
                    }else if (opcao_consulta == 4) {
                        break;
                    } else {
                        System.out.println("Opção Inválida! Tente novamente!\n");
                    }
                }
            } else if (opcao_menu == 5) {
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente!\n");
            }
        }
    }
}
