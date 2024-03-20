package modelo;

public class Sistema {

	public static void main(String[] args) {
		Imobiliaria m1 = new Imobiliaria("Imobiliaria Estrela", "Rua das Nações");
		Casa c1 = new CasaCampo("Rua America", 300, 3, 2, 1, 1, 1);
		Casa c2 = new CasaPraia("Rua Curitiba", 300, 3, 2, 1, 1, 1);
		m1.addImovel(c1);
		m1.addImovel(c2);
		System.out.println(m1.imprimirImoveis());
	}

}
