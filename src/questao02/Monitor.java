package questao02;

public class Monitor {
	private int polegadas;

	public Monitor() {
		
	}
	
	public Monitor(int polegadas) {
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	public void ligar() {
		System.out.println("Monitor Ligado");
	}

	@Override
	public String toString() {
		return "Monitor [polegadas=" + polegadas + "]";
	}
	
	
}
