package questao02;

import java.util.ArrayList;
import java.util.List;

public class Teclado {
	private List<Character> keys = new ArrayList<>();

	public Teclado() {
		
	}
	
	public Teclado(List<Character> keys) {
		for(Character c : keys) {
			this.keys.add(c);
		}
	}

	public List<Character> getKeys() {
		return keys;
	}

	public void setKey(Character key) {
		keys.add(key);
	}
	
	public void seeKeys() {
		for(Character c : keys) {
			System.out.println(c);
		}
	}

	@Override
	public String toString() {
		return "Teclado [keys=" + keys + "]";
	}
	
	
}	
