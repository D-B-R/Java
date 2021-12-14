
public class CriaConta {
	public static void main(String[] args) {
		POO primeiraConta = new POO(); // cria um objeto do tipo POO
		primeiraConta.saldo = 200;

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		POO segundaCOnta = new POO();
		segundaCOnta.saldo = 199;

		System.out.println(segundaCOnta.saldo);

		segundaCOnta.saldo += 100;
		System.out.println(segundaCOnta.saldo);
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		
		
		segundaCOnta.agencia = 145;
		System.out.println("novo valor na segunda agencia "+ segundaCOnta.agencia);
	}
	
	
	
	

}
