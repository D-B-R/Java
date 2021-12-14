
public class Programa07 {

	public static void main(String[] args) {

		System.out.println("testando IF");
		int idade = 11;
		int quantidadePessoas = 3;

		if (idade >= 18) {

			System.out.println("idade aprovada");
			System.out.println("seja bem vindo");
		}

		else {

			if (quantidadePessoas >= 2) {
				System.out.println("vc não tem 18 porem entra");
			}

			else {
				System.out.println("idade reprovada");
			}

		}

	}

}
