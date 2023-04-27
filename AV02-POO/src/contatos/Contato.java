package contatos;

public class Contato {
	//getters, setters, metodo to String, construtor que inicialize os atributos
	
	//Atributos
	private String nome;
	private int telefone;
	private String email;
	private Endereco endereco;
	
	//Construtor 
	public Contato(String nome, int telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "\nNome : " + nome + 
				"\nTelefone : " + telefone + 
				"\nEmail : " + email + 
				"\nEndereco : " + endereco.toString() +
				"\n-------------------------------------";
	}
	
	//classe endereço 
	
	
	
}
