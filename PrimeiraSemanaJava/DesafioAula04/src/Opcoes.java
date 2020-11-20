import java.util.Scanner;

public class Opcoes {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    public void selecionarOpcao1(){
    
    Impressora.imprimaValor("Qual o nome do seu animal preferido?");
    String animal = sc.nextLine();
    
    while (!animal.equals("gato")) {

        Impressora.imprimaValor("Eu prefiro gato");
        Impressora.imprimaValor("Qual o nome do seu animal preferido?");
        String animal = sc.nextLine();

    }

        Impressora.imprimaValor("Que legal, o meu tambem!");

    

    }



public void selecionarOpcao2(){

    Impressora.imprimaValor("Quak a idade do seu filho?");
    int idade = sc.nextInt();

    if (idade > 0 && idade < 12){
        Impressora.imprimaValor("Ele ainda é criança");
    } else if (idade > 11 && idade < 19) {
        Impressora.imprimaValor("Adolescência é fogo...");
    } else {
        Impressora.imprimaValor("Ele já é um adulto!");
    }

}

public void selecionarOpcao3(){
    Impressora.imprimaValor("Em construção... Será que vamos aprender for?");
}

}

}