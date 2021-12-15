
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente(); // direito --> nome da classe esquerdo - referencias

		g1.setNome("marcos");
		String nome = g1.getNome();
		
		g1.autentica(2222); // analisando o tipo da referencia 
		

		System.out.println(nome);

	}

}
