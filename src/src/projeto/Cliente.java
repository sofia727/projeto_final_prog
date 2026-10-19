package projeto;

public class Cliente extends Pessoa{
	
	private int cdCliente;
	

    public Cliente(String nome, String email, String telefone, int cdCliente) {
        super(nome, email, telefone);
        this.cdCliente = cdCliente;
        
    }

    public void cadastrar() {
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
    }
    
        
    public int getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}

	@Override
    public String toString() {
        return "Cliente [CD=" + cdCliente + ", Nome=" + nome + ", Email=" + email + ", Telefone=" + telefone + "]";
    }
	
	@Override 
	public void detalhes() {
		System.out.println("\nDados do cliente:" );
		super.detalhes();
		System.out.println("\nCódigo do cliente: " + cdCliente);
	}
}