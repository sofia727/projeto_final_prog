# Sistema de Gestão de Biblioteca

Projeto desenvolvido para a disciplina de Programação em Java. O sistema consiste numa aplicação de consola (CLI) orientada a objetos para o gerenciamento básico de uma biblioteca, cobrindo o cadastro e remoção de entidades, gestão de estoque e controle de empréstimos.

## Funcionalidades

- Cadastro e remoção de clientes
- Cadastro e remoção de livros
- Registo de aluguel de livros com validação de ID e verificação de estoque
- Registo de devolução com reposição automática de estoque (+1)
- Consulta do relatório de estoque atualizado
- Consulta do relatório de aluguéis ativos (com datas de empréstimo e previsão de devolução)

## Estrutura do Projeto

O código está organizado no pacote `projeto` e divide-se nas seguintes classes:

- **Main.java**: Contém a interface do menu interativo (`do-while` / `switch`), leitura de dados do utilizador e fluxo principal da aplicação.
- **Biblioteca.java**: Responsável pelo armazenamento e manipulação das coleções (`ArrayList`) de clientes, livros e aluguéis.
- **Pessoa.java**: Classe base com atributos comuns de identificação.
- **Cliente.java**: Herda de `Pessoa` e representa os utilizadores do sistema.
- **Bibliotecario.java**: Herda de `Pessoa` e possui métodos para geração e exibição de relatórios.
- **Livro.java**: Modela as informações do acervo e a quantidade em estoque.
- **Aluguel.java**: Modela a associação entre cliente e livro, registando as datas de início e previsão de retorno.

## Como Executar

1. Certifique-se de ter o Java Development Kit (JDK 8 ou superior) instalado.
2. Clone o repositório para o seu ambiente local:
   git clone https://github.com/sofia727/projeto_final_prog.git

3. Compile e execute a classe `Main.java` através da sua IDE de preferência (Eclipse, IntelliJ, VS Code) ou via terminal:
   javac -d bin src/projeto/*.java
   java -cp bin projeto.Main


<img width="663" height="962" alt="DiagramaProg drawio" src="https://github.com/user-attachments/assets/8ef69940-e4fd-4a67-adb1-3dad36511cf3" />
