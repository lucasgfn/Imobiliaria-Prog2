package modelo;


public abstract class Imovel {
		protected String endereco;
		protected int numeroImovel;
		protected int capacidadePessoas;
		protected int numeroQuartos;
		protected int numeroBanheiros;
		protected int numeroVagasGarragem;
	
		
		public Imovel(String endereco, int numeroImovel, int capacidadePessoas, int numeroQuartos, int numeroBanheiros,
				int numeroVagasGarragem) {
			super();
			this.endereco = endereco;
			this.numeroImovel = numeroImovel;
			this.capacidadePessoas = capacidadePessoas;
			this.numeroQuartos = numeroQuartos;
			this.numeroBanheiros = numeroBanheiros;
			this.numeroVagasGarragem = numeroVagasGarragem;
	
		}
		
		
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public int getNumeroImovel() {
			return numeroImovel;
		}
		public void setNumeroImovel(int numeroImovel) {
			this.numeroImovel = numeroImovel;
		}
		public int getCapacidadePessoas() {
			return capacidadePessoas;
		}
		public void setCapacidadePessoas(int capacidadePessoas) {
			this.capacidadePessoas = capacidadePessoas;
		}
		public int getNumeroQuartos() {
			return numeroQuartos;
		}
		public void setNumeroQuartos(int numeroQuartos) {
			this.numeroQuartos = numeroQuartos;
		}
		public int getNumeroBanheiros() {
			return numeroBanheiros;
		}
		
		@Override
		public String toString() {
			return "\nImovel: Endereço: " + endereco + ", Numero Residencial: " + numeroImovel + ", \nCapacidade Total:"
					+ capacidadePessoas + ", Números de Quartos:"+ numeroQuartos + ", Números de Banheiros:" + numeroBanheiros
					+ ", Vagas na Garragem:" + numeroVagasGarragem+"\n";
		}

		public void setNumeroBanheiros(int numeroBanheiros) {
			this.numeroBanheiros = numeroBanheiros;
		}
		public int getNumeroVagasGarragem() {
			return numeroVagasGarragem;
		}
		public void setNumeroVagasGarragem(int numeroVagasGarragem) {
			this.numeroVagasGarragem = numeroVagasGarragem;
		}


}
