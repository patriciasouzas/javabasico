import java.util.Scanner;

public class TreinandoScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String controle = sc.nextLine("C");
        
        while (controle.equals("C")) {

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o seu peso: ");
        float peso = sc.nextFloat();

        System.out.printf("Meu nome eh %s \n", nome);
        System.out.printf("Minha idade eh %d \n", idade);
        System.out.printf("Meu peso eh %2.2f", peso);

        System.out.print("Digite a letra de controle: ");
        String controle = sc.nextLine();

        }
    }

// public static void verificaIdadeEPeso (float peso, int idade, String nome){

//         if ((peso > 80 && idade > 40) || nome.equals("Patricia")){
//          System.out.println("\nVoce precisa correr mais");
//         } else {
//          System.out.println("\nComa mais carboidratos");
//          }

// }
//         switch (idade) {
//             case 80:
//                 System.out.println("Parabens pelos seus 80 anos!");
//                 break;
//             case 40:
//                 System.out.println("Parabens pelos seus 40 anos!");
//                 break;
//             default:
//                 System.out.println("Voce ainda eh jovem!");
//                 break;
//         }

//     }
}
