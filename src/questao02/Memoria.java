package questao02;

public class Memoria {
	private int mb;

	public Memoria() {
		
	}
	
	public Memoria(int mb) {
		this.mb = mb;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}

	@Override
	public String toString() {
		return "Memoria [mb=" + mb + "]";
	}
	
	
}
