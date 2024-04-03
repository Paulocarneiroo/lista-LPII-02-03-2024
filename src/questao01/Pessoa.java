package questao01;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private Data dataNasc;
	private List<Endereco> enderecos = new ArrayList<>();
	private List<Contato> contatos = new ArrayList<>();
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Data dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Data getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}

	
	public void addEndereco(Endereco end) {
		enderecos.add(end);
	}

	public void addContato(Contato cont) {
		contatos.add(cont);
	}
	
	
}
