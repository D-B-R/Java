
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Funcionario g) {

		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("pode entrar no sistema");
		} else {
			System.out.println("não pode entrar no sistema");
		}
	}

}
