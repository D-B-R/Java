
public class ControleBonifacacao {

	private double soma;

	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;

	}

	public void registra(Funcionario f) { // fora do padrão de herança , codigos repetidos
		double boni = f.getBonificacao(); // 3 metodos para a mesma coisa
		this.soma = this.soma + boni;

	}

	public void registra(EditorVideo ev) {
		double boni = ev.getBonificacao();
		this.soma = this.soma + boni;

	}

	public double getSoma() {
		return soma;
	}

}
