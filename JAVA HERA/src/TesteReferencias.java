
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente(); // direito --> nome da classe

		g1.setNome("marcos");
		String nome = g1.getNome();

		System.out.println(nome);

	}

}
