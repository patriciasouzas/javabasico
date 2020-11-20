import java.util.Scanner;


/**
 * @author patri
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();

		for (int i = 0; i < texto.length(); i++) {
			if (i == 8) {
				System.out.print("O tamanho da String é maior que 10");

			}
		}
		
		
	}

}
