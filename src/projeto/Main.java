package projeto;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Biblioteca biblioteca = new Biblioteca();
		
		Scanner sc = new Scanner(System.in);
		
		
		//criar bibliotecari
		Bibliotecario bibliotecario = new Bibliotecario("Carlos", 1, "carlos@email.com", "49 988887777");
		
		//cadastro de novos clientes 
		Cliente c1 = new Cliente("Ana Silva", "ana@email.com", "49 999991111", 1);
		Cliente c2 = new Cliente("Pedro Santos", "pedro@email.com", "49 999992222", 2);
		biblioteca.adicionarCliente(c1);
		biblioteca.adicionarCliente(c2);
		
		//cadastro de novos livros 
		Livro l1 = new Livro(101, "Dom Casmurro", "Machado de Assis", 3);
		Livro l2 = new Livro(102, "Memórias Póstumas", "Machado de Assis", 7);
		Livro l3 = new Livro(103, "Meu Primo Basílio", "Eça de Queiroz", 5);
		biblioteca.adicionarLivro(l1);
		biblioteca.adicionarLivro(l2);
		biblioteca.adicionarLivro(l3);


		//reg de aluguel
		Aluguel alug1 = new Aluguel(1001, c1, l1, LocalDate.now(), LocalDate.now().plusDays(7));
		biblioteca.registrarAluguel(alug1); 
		
	
		int opcao;
		
		do {
		System.out.println("\nSistema de Gestão da Biblioteca\n");
		System.out.println("Digite 1 para Cadastrar Cliente");
		System.out.println("Digite 2 para Cadastrar Livro");
        System.out.println("Digite 3 para Registrar Aluguel");
        System.out.println("Digite 4 para Ver Relatório de Estoque");
        System.out.println("Digite 5 para ver Relatório de Aluguéis");
        System.out.println("Digite 0 para Sair");
        
        opcao = sc.nextInt();

		switch(opcao){
			case 1:
				System.out.print("Nome do cliente: ");
                String nomeCliente = sc.next();
                System.out.print("Email do cliente: ");
                String emailCliente = sc.next(); 
                System.out.print("Telefone do cliente: ");
                String telCliente = sc.next();
                System.out.print("Código do cliente (ID): ");
                int idCliente = sc.nextInt();
                
                Cliente novoCliente = new Cliente(nomeCliente, emailCliente, telCliente, idCliente);
                biblioteca.adicionarCliente(novoCliente);
                System.out.println("\nCliente cadastrado com sucesso!");
                break;
                
			case 2:
                System.out.print("ID do Livro: ");
                int idLivro = sc.nextInt();
                System.out.print("Título do livro: ");
                String titulo = sc.nextLine();
                System.out.print("Autor do livro: ");
                String autor = sc.nextLine();
                System.out.print("Quantidade em estoque: ");
                int estoque = sc.nextInt();

                Livro novoLivro = new Livro(idLivro, titulo, autor, estoque);
                biblioteca.adicionarLivro(novoLivro);
                System.out.println("\nLivro cadastrado com sucesso!");
                break;

			case 3:
			    System.out.print("ID do Aluguel: ");
			    int idAluguel = sc.nextInt();

			    Cliente clienteEncontrado = null;
			    while (clienteEncontrado == null) {
			        System.out.print("ID do cliente: ");
			        int buscaCliId = sc.nextInt();
			        
			        for (Cliente c : biblioteca.listarClientes()) {
			            if (c.getCdCliente() == buscaCliId) {
			                clienteEncontrado = c;
			                break;
			            }
			        }
			        if (clienteEncontrado == null) {
			            System.out.println("\nDigite um ID válido ou registre novo cliente.");
			        }
			    }


			    Livro livroEncontrado = null;
			    while (livroEncontrado == null) {
			        System.out.print("ID do livro: ");
			        int buscaLivroId = sc.nextInt();
			        
			        for (Livro l : biblioteca.listarLivros()) {
			            if (l.getCdLivro() == buscaLivroId) {
			                livroEncontrado = l;
			                break;
			            }
			        }
			        if (livroEncontrado == null) {
			            System.out.println("\nLivro não existe! Digita um ID válido.");
			        }
			    }
			    
			    
                if (clienteEncontrado != null && livroEncontrado != null) {
                    Aluguel novoAluguel = new Aluguel(idAluguel, clienteEncontrado, livroEncontrado, LocalDate.now(), LocalDate.now().plusDays(7));
                    biblioteca.registrarAluguel(novoAluguel);
                    System.out.println("\nAluguel registrado com sucesso!");
                } else {
                    System.out.println("\nErro: Cliente ou Livro não encontrados com os IDs informados.");
                }
                break;

            case 4:
                System.out.println();
                bibliotecario.verificarEstoque(biblioteca.listarLivros());
                break;

            case 5:
                System.out.println();
                bibliotecario.relaAluguel(biblioteca.listarAlugueis());
                break;

            case 0:
                System.out.println("\nSistema encerrado.");
                break;

            default:
                System.out.println("\nDigite uma opção válida.");
        }
			

		}while (opcao != 0);
		
		
		sc.close();		
		
	}

}
