package modelo;

import java.util.ArrayList;

public class Imobiliaria {
	private String nome;
	private String endereco;
	private ArrayList<Imovel> imoveis;

	
	public Imobiliaria(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.imoveis = new ArrayList<Imovel>();
	
	}
	
	public boolean addImovel(Imovel umImovel) {
		return imoveis.add(umImovel);
	}
	public boolean removerImovel(Imovel umImovel) {
		return imoveis.remove(umImovel);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String imprimirImoveis() {
		String retorno="Imobiliaria: "+ this.nome +"\n";
		for(Imovel imovel: imoveis) {
			retorno += imovel.toString();
		}
		return retorno;
	}

}
