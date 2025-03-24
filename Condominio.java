import java.util.*;

public class Condominio {
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;
    private String horarioFuncionamento;

    private ArrayList<Proprietario> proprietarios = new ArrayList<>();
    private ArrayList<Unidade> unidades = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void cadastrarCondominio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+----------------------------------+");
        System.out.println("|       CADASTRAR CONDOMINIO       |");
        System.out.println("+----------------------------------+");
        System.out.print("Nome do Condominio: ");
        setNome(sc.nextLine());
        System.out.println();

        System.out.print("Razão Social do Condominio: ");
        setRazaoSocial(sc.nextLine());
        System.out.println();

        System.out.print("CNPJ do Condominio: ");
        setCnpj(sc.nextLine());
        System.out.println();

        System.out.print("Email do Condominio: ");
        setEmail(sc.nextLine());
        System.out.println();

        System.out.print("Telefone do Condominio: ");
        setTelefone(sc.nextLine());
        System.out.println();

        System.out.print("Endereco do Condominio: ");
        setEndereco(sc.nextLine());
        System.out.println();

        System.out.print("Horario de Funcionamento do Condominio: ");
        setHorarioFuncionamento(sc.nextLine());
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void cadastrarProprietario(Proprietario proprietario) {
        proprietarios.add(proprietario);
    }

    public void cadastrarUnidade(Unidade unidade) {
        unidades.add(unidade);
    }

    public ArrayList<Proprietario> getProprietarios() {
        return proprietarios;
    }

    public ArrayList<Unidade> getUnidades() {
        return unidades;
    }

    public void mostrarCondominio() {
        System.out.println("Nome do Condominio: " + getNome());
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Horário de Funcionamento: " + getHorarioFuncionamento() + "\n");
    }
}