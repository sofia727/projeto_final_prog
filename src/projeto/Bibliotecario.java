package projeto;

import java.util.List;

public class Bibliotecario extends Pessoa{
	
	private int cdBibliotecario;

    public Bibliotecario(String nome, int cdBibliotecario, String email, String telefone) {
        super(nome, email, telefone);
        this.cdBibliotecario = cdBibliotecario;
    }


    public void verificarEstoque(List<Livro> estoque) {
        System.out.println("Relatório de estoque:");
        if (estoque != null && !estoque.isEmpty()) {
            for (Livro livro : estoque) {
                System.out.println("\nLivro: " + livro.getTitulo() + "\nEstoque: " + livro.getEstoque());
            }
        } else {
            System.out.println("Nenhum livro no estoque.");
        }
    }


    public void relaAluguel(List<Aluguel> historico) {
        System.out.println("Relatório de aluguéis: ");
        if (historico != null && !historico.isEmpty()) {
            for (Aluguel aluguel : historico) {
                System.out.println("Aluguel ID: " + aluguel.getCdAluguel() + "\nCliente: " + aluguel.getCliente().getNome() + "\nLivro: " + aluguel.getLivro().getTitulo());
            }
        } else {
            System.out.println("Nenhum aluguel registrado.");
        }
    }


	public int getCdBibliotecario() {
		return cdBibliotecario;
	}


	public void setCdBibliotecario(int cdBibliotecario) {
		this.cdBibliotecario = cdBibliotecario;
	}
    
    
	@Override 
	public void detalhes() {
		System.out.println("\nDados do bibliotecário:" );
		super.detalhes();
		System.out.println("\nCódigo do bibliotecário: " + cdBibliotecario);
	}
    


}