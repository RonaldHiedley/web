import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("Escolha uma opcao:");
			System.out.println("1 - Adicionar contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Buscar contato");
			System.out.println("4 - Imprimir agenda");
			System.out.println("0 - Sair");
			
			switch (opcao) {
				case 1:
					System.out.print("Nome: ");
					String nome = scanner.next();
					
					System.out.print("Telefone: ");
					String telefone = scanner.next();
					
					System.out.print("Email: ");
					String email = scanner.next();
					
					Contato contato = new Contato(nome, telefone, email);
					agenda.adicionarContao(contato);
					
					System.out.println("Contato adicionado com sucesso!");
					break;
				case 2:
					System.out.print("Nome do contato a ser removido: ");
					String nomeRemover = scanner.next();
					
					Contato contatoRemover = agenda.buscarContato(nomeRemover);
					
					if (contatoRemover == null){
						System.out.println("Contato nao encontrado!");
					} else {
						agenda.removerContato(agenda.buscarIndiceContato(contatoRemover));
						System.out.println("Contato removido com sucesso!");
					}
					
					break;
				case 3:
					System.out.println("Nome do contato a ser buscado: ");
					String nomeBuscar = scanner.next();
					
					Contato contatoBuscando = agenda.buscarContato(nomeBuscar);
					
					if (contatoBuscar == null) {
						System.out.println("Contato nao encontrado!");
					} else {
						System.out.println("Nome: " + contatoBuscado.getNome());
						System.out.println("Telefone: " + contatoBuscado.getTelefone());
						System.out.println("Email: " + contatoBuscado.getEmail());
					}
					
					break;
				case 4:
					agenda.imprimirAgenda();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao invalida");
					break;
					
			}
			
		}
		
		
		scanner.close();
		
	}
}
