package questao03;

public class Main {

	public static void main(String[] args) {
		Autor autor = new Autor("Joao", 18);
		Editora ed = new Editora("Fiel", 1);
		
		Livro livro = new Livro("Java", autor, 1, ed);
		
		livro.consultarAutor();
		livro.consultarEditora();
		
		System.out.println(livro);

	}

}
