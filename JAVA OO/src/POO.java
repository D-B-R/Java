
public class POO {

	double saldo;
	int agencia = 42;
	int numero = 55;
	String titular;

	void deposita(double valor) {

		this.saldo = this.saldo + valor; // saldo é um atributo e valor é algo temporario

	}

	public boolean saca(double valor) {

		if (this.saldo >= saldo) {

			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, POO destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;

			destino.deposita(valor);
			return true;
		
		}
		else {
			return false;
		}
	}

}
