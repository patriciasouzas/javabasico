import java.util.Scanner;

public class Impressora {

    public static void imprimaValor (String parametro) {
        System.out.println(parametro);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
         Impressora imprimir = new Impressora();
    
         Impressora.imprimaValor("Imprimir no console usando a classe Impressora deu certo!");
    
    }

}