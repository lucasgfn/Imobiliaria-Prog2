package modelo;

public class CasaPraia extends Casa{
	private double distanciaPraia;

	public CasaPraia(String endereco, int numeroImovel, int capacidadePessoas, int numeroQuartos, int numeroBanheiros,
			int numeroVagasGarragem, int qntAndar) {
		super(endereco, numeroImovel, capacidadePessoas, numeroQuartos, numeroBanheiros, numeroVagasGarragem, qntAndar);
		this.distanciaPraia = distanciaPraia;
	}

	@Override
	public String toString() {
		return super.toString() + " Distencia Praia:" + distanciaPraia ;
	}

	
	

}
