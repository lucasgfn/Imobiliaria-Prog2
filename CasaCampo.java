package modelo;


public class CasaCampo extends Casa{
	private double areaExterna; 
	private boolean lagoa;
		

	public CasaCampo(String endereco, int numeroImovel, int capacidadePessoas, int numeroQuartos, int numeroBanheiros,
			int numeroVagasGarragem, int qntAndar) {
		super(endereco, numeroImovel, capacidadePessoas, numeroQuartos, numeroBanheiros, numeroVagasGarragem, qntAndar);
		this.areaExterna = areaExterna;
		this.lagoa = lagoa;
	}
	
	public String getTemLagoa() {
		return lagoa ? "Tem lagoa" : "Não tem lagoa";
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " Area Externa" + areaExterna + ", \nInformações Extras: "+ getTemLagoa()+"\n";
	}

	

}
