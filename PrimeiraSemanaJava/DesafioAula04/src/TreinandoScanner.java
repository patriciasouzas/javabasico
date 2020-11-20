import java.util.Scanner;

/**
 * @author marcu
 *
 */
public class TreinandoScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia o seu String nome; int idade; float peso; Imprimir
		 * Meu nome � ... Minha idade � ... Meu peso � ... Realize um teste com o if:
		 * Caso peso seja maior que 80 imprimir : Voc� precisa correr mais. Caso peso
		 * seja menor : Coma mais carboidratos. 
		 * Adicione toda a cadeia de codigo que
		 * criamos em uma estrutura while enquanto o valor de controle for "C"
		 **/

		// ++ � o mesmo que somar +1
		// -- � o mesmo que diminuir -1

		String controle = "C";
		Scanner sc = new Scanner(System.in);
		while (controle.equals("C")) {
			
			System.out.print("Informe seu nome:");
			String nome = sc.nextLine();
			System.out.print("Informe sua idade:");
			int idade = sc.nextInt();
			System.out.print("Informe seu peso:");
			float peso = sc.nextFloat();

			System.out.printf("\nMeu nome � %s \nMinha  idade � %d  \nMeu peso � %.2f \n", nome, idade, peso);

			// metodo verificaIdade(peso,idade,nome) dentro da classe TreinandoScanner
			verificaIdadeEPeso(peso, idade, nome);
			// metodo verificaIdadeComSwitch(idade) dentro da classe TreinandoScanner
			verificaIdadeComSwitch(idade);
		}
	}

	public static void verificaIdadeEPeso(float peso, int idade, String nome) {
		// && testa se duas condi��es s�o verdadeiras, caso sejam retorna true
		// || testa se uma das condi��es � verdadeira, caso seja retorna true
		// ! nega o booleano !true = false;
		if ((peso > 80 && idade > 40) || nome.equals("Marcus")) {
			System.out.println("Voc� precisa correr mais");
		} else {
			System.out.println("Coma mais carboidratos");
		}
	}

	public static void verificaIdadeComSwitch(int idade) {
		switch (idade) {
		case 80:
			System.out.println("Parab�ns pelos seus 80 anos!");
			break;

		case 40:
			System.out.println("Parab�ns pelos seus 40 anos!");
			break;

		default:
			System.out.println("Voc� ainda � jovem!");
			break;
		}
	}

}