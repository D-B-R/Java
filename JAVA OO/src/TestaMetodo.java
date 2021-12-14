import java.awt.Container;

public class TestaMetodo {

	public static void main(String[] args) {

		POO pooDoPaulo = new POO();

		pooDoPaulo.saldo = 100;
		pooDoPaulo.deposita(50);

		System.out.println(pooDoPaulo.saldo); // deve passa de qual objeto se deseja imprimir e de qual atributo do
												// objeto
		pooDoPaulo.saca(20);
		System.out.println(pooDoPaulo.saldo);

		POO pooDaMarcela = new POO();
		pooDaMarcela.deposita(1000);

		if (pooDaMarcela.transfere(300, pooDoPaulo)) {
			System.out.println("sucesso");
		} else {
			System.out.println("defeito");
		}

		pooDaMarcela.transfere(300, pooDoPaulo);

		System.out.println(pooDaMarcela.saldo);
		System.out.println(pooDoPaulo.saldo);

		pooDoPaulo.titular = "guerra";

		System.out.println(pooDoPaulo.titular);
	}
}
