package projeto;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args){
		Biblioteca biblioteca = new Biblioteca();
		
		//cadastro de novos clientes 
		Cliente c1 = new Cliente(1, "Ana Silva", "ana@email.com", "49 999991111");
		Cliente c2 = new Cliente(2, "Pedro Santos", "pedro@email.com", "49 999992222");
		biblioteca.adicionarCliente(c1);
		biblioteca.adicionarCliente(c2);
		
		//cadastro de novos livros 
		Livro l1 = new Livro(101, "Dom Casmurro", "Machado de Assis", 5);
		Livro l2 = new Livro(102, "Memórias Póstumas", "Machado de Assis", 2);
		Livro l3 = new Livro(103, "Meu Primo Basílio", "Eça de Queiroz", 7);
		biblioteca.adicionarLivro(l1);
		biblioteca.adicionarLivro(l2);
		biblioteca.adicionarLivro(l3);
		
		//criar bibliotecari
		Bibliotecario bibliotecario = new Bibliotecario(1, "Carlos");
		
		//reg de aluguel
		Aluguel alug1 = new Aluguel(1001, c1, l1, LocalDate.now(), LocalDate.now().plusDays(7));
		biblioteca.registrarAluguel(alug1); 
		
	
		
		//testar relatorios
		bibliotecario.verificarEstoque(biblioteca.listarLivros());
		System.out.println();
		bibliotecario.relaAluguel(biblioteca.listarAlugueis());
		
		
	}

}
