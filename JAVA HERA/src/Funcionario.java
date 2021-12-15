
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario; // visivel para os filhos

	public Funcionario() {

	}

	public double getBonificacao() { // metodo de retorno com 10% de bnificac��o do salario

		return this.salario * 0.05;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
