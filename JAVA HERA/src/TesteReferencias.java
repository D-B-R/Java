
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente(); // direito --> nome da classe esquerdo - referencias

		g1.setNome("marcos");
		g1.setSalario(5000.0);

		Funcionario f = new Funcionario();
		f.setSalario(2000.0);

		Funcionario ev = new EditorVideo();
		f.setSalario(2500.0);

		ControleBonifacacao controle = new ControleBonifacacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);

		System.out.println(controle.getSoma());
	}

}
