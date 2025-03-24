import java.util.*;

public class Unidade {
    private int codigo_unidade;
    private int qtd_moradores;
    private String endereco;

    public Unidade(int codigo_unidade, int qtd_moradores, String endereco) {
        this.codigo_unidade = codigo_unidade;
        this.qtd_moradores = qtd_moradores;
        this.endereco = endereco;
    }

    public int getCodigoUnidade() {
        return codigo_unidade;
    }

    public int getQtdMoradores() {
        return qtd_moradores;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCodigoUnidade(int codigo_unidade) {
        this.codigo_unidade = codigo_unidade;
    }

    public void setQtdMoradores(int qtd_moradores) {
        this.qtd_moradores = qtd_moradores;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static void cadastrarUnidade(Condominio condominio) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------------------+");
        System.out.println("|        CADASTRAR UNIDADE        |");
        System.out.println("+---------------------------------+");
        System.out.print("Código da Unidade: ");
        int codigo_unidade = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.print("Quantidade de Moradores da Unidade: ");
        int qtdMoradores_unidade = sc.nextInt();
        sc.nextLine();
        System.out.println();

        System.out.print("Endereço da Unidade: ");
        String endereco_unidade = sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

        Unidade unidade = new Unidade(codigo_unidade, qtdMoradores_unidade, endereco_unidade);
        condominio.cadastrarUnidade(unidade);
    }

    public static void mostrarUnidades(Condominio condominio) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("+---------------------------------+");
            System.out.println("|      Relatório de Unidades      |");
            System.out.println("+---------------------------------+");
            for (Unidade unidade : condominio.getUnidades()) {
                System.out.println("Código: " + unidade.getCodigoUnidade());
                System.out.println("Quantidade de Moradores: " + unidade.getQtdMoradores());
                System.out.println("Endereço: " + unidade.getEndereco());
                System.out.println("\n+---------------------------------+\n");
            }
            System.out.print("Digite 0 para sair: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                break;
            }
        }
    }
}
