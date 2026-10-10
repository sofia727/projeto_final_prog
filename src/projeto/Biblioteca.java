package projeto;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Aluguel> alugueis = new ArrayList<>();

    // crud cliente
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarClientePorId(int cdCliente) {
        for (Cliente c : clientes) {
            if (c.getCdCliente() == cdCliente) return c;
        }
        return null;
    }

    public boolean removerCliente(int cdCliente) {
        Cliente c = buscarClientePorId(cdCliente);
        if (c != null) {
            clientes.remove(c);
            return true;
        }
        return false;
    }

    // crud livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> listarLivros() {
        return livros;
    }

    public Livro buscarLivroPorId(int cdLivro) {
        for (Livro l : livros) {
            if (l.getCdLivro() == cdLivro) return l;
        }
        return null;
    }

    public boolean removerLivro(int cdLivro) {
        Livro l = buscarLivroPorId(cdLivro);
        if (l != null) {
            livros.remove(l);
            return true;
        }
        return false;
    }

    // crud aluguel
    public void registrarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public ArrayList<Aluguel> listarAlugueis() {
        return alugueis;
    }
}