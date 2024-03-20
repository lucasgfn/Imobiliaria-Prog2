package modelo;

public abstract class Casa extends Imovel{
	protected int qntAndar;

	public Casa(String endereco, int numeroImovel, int capacidadePessoas, int numeroQuartos, int numeroBanheiros,
			int numeroVagasGarragem, int qntAndar) {
		super(endereco, numeroImovel, capacidadePessoas, numeroQuartos, numeroBanheiros, numeroVagasGarragem);
		this.qntAndar = qntAndar;
	}

}
