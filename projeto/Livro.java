package projeto;

public class Livro {

    private int cdLivro;
    private String titulo;
    private String autor;
    private int estoque;

 
    public Livro() {
    }

    // construtor
    public Livro(int cdLivro, String titulo, String autor, int estoque) {
        this.cdLivro = cdLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.estoque = estoque;
    }

    // getter para cdLivro 
    public int getCdLivro() {
        return cdLivro;
    }

    public void setCdLivro(int cdLivro) {
        this.cdLivro = cdLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int quant) {
        this.estoque = quant;
    }
}