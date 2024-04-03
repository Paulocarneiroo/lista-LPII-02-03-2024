package questao03;

public class Autor {
	private String name;
	private int idade;
	
	public Autor(String name, int idade) {
		super();
		this.name = name;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Autor [name=" + name + ", idade=" + idade + "]";
	}
	
	
}
