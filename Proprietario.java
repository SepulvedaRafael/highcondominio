import java.util.*;

public class Proprietario {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private String data_nascimento;
    private boolean morador;

    public Proprietario(String nome, String cpf, String endereco, String email, String telefone, String data_nascimento, boolean morador) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.morador = morador;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return data_nascimento;
    }

    public boolean getMorador() {
        return morador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void setDataNascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setMorador(boolean morador) {
        this.morador = morador;
    }

    public static void cadastrarProprietario(Condominio condominio) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+----------------------------------+");
        System.out.println("|      CADASTRAR PROPRIETÁRIO      |");
        System.out.println("+----------------------------------+");
        System.out.print("Nome do Proprietário: ");
        String nome_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("CPF do Proprietário: ");
        String cpf_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("Endereço do Proprietário: ");
        String endereco_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("Email do Proprietário: ");
        String email_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("Telefone do Proprietário: ");
        String telefone_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("Data de Nascimento do Proprietário: ");
        String dataNascimento_proprietario = sc.nextLine();
        System.out.println();

        System.out.print("Morador (S/N): ");
        String opcao_morador = sc.nextLine();
        boolean morador_proprietario = false;
        if (opcao_morador.equals("S")) {
            morador_proprietario = true;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

        Proprietario proprietario = new Proprietario(nome_proprietario, cpf_proprietario, endereco_proprietario, email_proprietario, telefone_proprietario, dataNascimento_proprietario, morador_proprietario);

        condominio.cadastrarProprietario(proprietario);
    }

    public static void mostrarProprietarios(Condominio condominio) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("+----------------------------------+");
            System.out.println("|    Relatório de Proprietarios    |");
            System.out.println("+----------------------------------+");
            int numero = 1;
            for (Proprietario proprietario : condominio.getProprietarios()) {
                System.out.println("N°: " + numero);
                System.out.println("Nome: " + proprietario.getNome());
                System.out.println("CPF: " + proprietario.getCpf());
                System.out.println("Endereço: " + proprietario.getEndereco());
                System.out.println("Email: " + proprietario.getEmail());
                System.out.println("Telefone: " + proprietario.getTelefone());
                System.out.println("Data de Nascimento: " + proprietario.getDataNascimento());
                System.out.println("Morador? " + proprietario.getMorador());
                System.out.println("\n+---------------------------------+\n");
                numero++;
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
