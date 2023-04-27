package contatos;

public class Endereco {
	
		private String logradouro;
		private int numeroImovel;
		private int CEP;
		private String cidade;
		private Estado estado;
		
		//construtor
		//Getters and Setters
		public Endereco(String logradouro, int numeroImovel, int cEP, String cidade, contatos.Estado estado) {
			super();
			this.logradouro = logradouro;
			this.numeroImovel = numeroImovel;
			CEP = cEP;
			this.cidade = cidade;
			this.estado = estado;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public int getNumeroImovel() {
			return numeroImovel;
		}

		public void setNumeroImovel(int numeroImovel) {
			this.numeroImovel = numeroImovel;
		}

		public int getCEP() {
			return CEP;
		}

		public void setCEP(int cEP) {
			CEP = cEP;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public Estado getEstado() {
			return estado;
		}

		public void setEstado(Estado estado) {
			this.estado = estado;
		}

		@Override
		public String toString() {
			return  logradouro + 
					", " + numeroImovel + 
					"\nCEP : " + CEP + 
					"\nCidade : " + cidade + 
					"-" + estado.toString() ;
		}
				
	
}
