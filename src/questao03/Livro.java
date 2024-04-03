package questao03;

public class Livro {
	private String titulo;
	private Autor autor;
	private int capitulo;
	private Editora editora;
	
	
	public Livro(String titulo, Autor autor, int capitulo, Editora editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.capitulo = capitulo;
		this.editora = editora;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public int getCapitulo() {
		return capitulo;
	}


	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}


	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public void consultarAutor() {
		System.out.println("O autor desse livro é " + autor.getName());
	}
	
	public void consultarEditora() {
		System.out.println("A editora desse livro é " + editora.getName());
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", capitulo=" + capitulo + ", editora=" + editora + "]";
	}
	
	
	
}
