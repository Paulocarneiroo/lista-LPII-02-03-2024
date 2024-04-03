package questao02;

public class PlacaMae {
	private String marca;
	private int numSerie;
	
	
	public PlacaMae() {
		
	}
	
	public PlacaMae(String marca, int numSerie) {
		this.marca = marca;
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	
	public void testar() {
		System.out.println("Testando... Boas condições");
	}
}
