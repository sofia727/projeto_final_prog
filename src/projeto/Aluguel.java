package projeto;

import java.time.LocalDate;

public class Aluguel {

    private int cdAluguel;
    private Cliente cliente;
    private Livro livro;
    private LocalDate dtAluguel;
    private LocalDate dtDevolucao;

    // construtor
    public Aluguel() {
    }

    
    public Aluguel(int cdAluguel, Cliente cliente, Livro livro, LocalDate dtAluguel, LocalDate dtDevolucao) {
        this.cdAluguel = cdAluguel;
        this.cliente = cliente;
        this.livro = livro;
        this.dtAluguel = dtAluguel;
        this.dtDevolucao = dtDevolucao;
    }

    // getters e setters
    public int getCdAluguel() {
        return cdAluguel;
    }

    public void setCdAluguel(int cdAluguel) {
        this.cdAluguel = cdAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDtAluguel() {
        return dtAluguel;
    }

    public void setDtAluguel(LocalDate dtAluguel) {
        this.dtAluguel = dtAluguel;
    }

    public LocalDate getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public void registrarAluguel() {
        System.out.println("Aluguel nº " + cdAluguel + " registrado para o cliente " + cliente.getNome());
    }

    @Override
    public String toString() {
        return "Aluguel [CD=" + cdAluguel + ", Cliente=" + cliente.getNome() + ", Livro=" + livro.getTitulo()
                + ", Data=" + dtAluguel + ", Devolução=" + dtDevolucao + "]";
    }
}