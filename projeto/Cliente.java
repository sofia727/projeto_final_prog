package projeto;

public class Cliente {
    private int cdCliente;
    private String nome;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int cdCliente, String nome, String email, String telefone) {
        this.cdCliente = cdCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrar() {
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
    }

    @Override
    public String toString() {
        return "Cliente [CD=" + cdCliente + ", Nome=" + nome + ", Email=" + email + ", Telefone=" + telefone + "]";
    }
}