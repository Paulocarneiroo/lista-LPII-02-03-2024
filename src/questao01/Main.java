package questao01;

public class Main {

	public static void main(String[] args) {
		
		Contato con = new Contato("4002-8922", "(11) 91234-1234", "ana@email.com");
		Data data = new Data(2, 4, 2000);
		Endereco end = new Endereco("Rua da pipoca", 51, "Bairro da pipoca", "Patos", "Paraíba", "58701-530");
		
		Pessoa pessoa = new Pessoa("Ana", data);
		
		pessoa.addContato(con);
		pessoa.addEndereco(end);
		
		System.out.println(pessoa);
	}

}
