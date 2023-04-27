package agenda;
import contatos.Contato;
import contatos.Endereco;
import contatos.Estado;

public class ContatoApp {

	public static void main(String[] args) {
		
		// 1 objeto do tipo agenda
		Agenda ag = new Agenda();
		
		//2 objetos do tipo contato inicializados
		
		//Contato 1
			
		Contato c1 = new Contato("Antonio", 236625155, "antonio@gmail.com",new Endereco("Rua XYZ",123,13366534,"Fortaleza",Estado.CE));
		
		//Contato 2 	
		Contato c2 = new Contato("João", 236625155, "joao@yahoo.com",new Endereco("Rua ABC",123,13366534,"São José dos Campos",Estado.SP));
		
		//insira os contatos na agenda usando o metodo criado
		ag.inserirContato(c1);
		ag.inserirContato(c2);
		
		//Liste na tela os caontatosque estão na agenda.
		
		System.out.println("Meus Contatos: ");
		ag.listarContatos();
	

	}

}
