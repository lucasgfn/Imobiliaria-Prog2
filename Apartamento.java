package modelo;

public class Apartamento extends Imovel{
	private boolean piscina;
	private int numAndar;
	private boolean elevador;
	
	public Apartamento(String endereco, int numeroImovel, int capacidadePessoas, int numeroQuartos, int numeroBanheiros,
			int numeroVagasGarragem) {
		super(endereco, numeroImovel, capacidadePessoas, numeroQuartos, numeroBanheiros, numeroVagasGarragem);
		this.elevador = elevador;
		this.numAndar = numAndar;
		this.piscina = piscina;
		
	}

	@Override
	public String toString() {
		return super.toString() +" Piscina=" + piscina + ", numAndar=" + numAndar + ", elevador=" + elevador + "]";
	}
	

	

	

}
