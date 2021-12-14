
public class TesteReferencias {

	public static void main(String[] args) {

		POO primeiraConta = new POO();
		primeiraConta.saldo = 500;

		System.out.println("saldo da primeira conta " + primeiraConta.saldo);

		POO segundaConta = primeiraConta; // referencia a uma conta

		System.out.println(segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);

		System.out.println(primeiraConta.saldo);

		if (primeiraConta == segundaConta) {

			System.out.println("são as mesma conta");
			
			
			if(primeiraConta == segundaConta) {
				System.out.println("mesma conta2");
			}
			else {
				
				System.out.println("Não são as mesma contas");
			}
		}

	}
}
