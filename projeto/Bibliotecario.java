package projeto;

import java.util.List;

public class Bibliotecario {


    private int cdBibliotecario;
    private String nome;


    public Bibliotecario() {
    }


    public Bibliotecario(int cdBibliotecario, String nome) {
        this.cdBibliotecario = cdBibliotecario;
        this.nome = nome;
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
                System.out.println("Aluguel ID: " + aluguel.getCdAluguel() + 
                                   "\nCliente: " + aluguel.getCliente().getNome() + 
                                   "\nLivro: " + aluguel.getLivro().getTitulo());
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}