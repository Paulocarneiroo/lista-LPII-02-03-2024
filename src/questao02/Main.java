package questao02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Character> keys = new ArrayList<>();
		keys.add('a');
		keys.add('b');
		keys.add('c');
		keys.add('d');
		keys.add('e');
		Teclado tec = new Teclado(keys);

		PlacaMae placaMae = new PlacaMae("Gigabyte", 1234);
		Monitor monitor = new Monitor(40);
		Memoria memoria = new Memoria(4000);
		
		Computador comp = new Computador(tec, monitor, memoria, placaMae);
		
		comp.consularMemoria();
		comp.digitar();
		comp.ligarTela();
		comp.testarPlacaMae();
	}

}
