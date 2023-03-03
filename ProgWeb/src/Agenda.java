import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos = new ArrayList<>();
	
	public void adicionarContao(Contato contato) {
		contatos.add(contato);
	}
	
	public void removerContato(int indice) {
		contatos.remove(indice);
	}
	
	public Contato buscarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}
	
	public void imprimirAgenda() {
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("---------------------");
		}
	}
}
