
public class TesteGerente {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("daniel");
		g1.setCpf("2222");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);

		System.out.println(g1.getBonificacao());
	}
}
