public class Somando {

public static void main(String[] args) {
    
int valor1 = 9;
int valor2 = 3;
int soma = valor1 + valor2;
String mensagem = "Ocorreu uma alteracao no valor da soma, ja que ";

System.out.println(valor1 + " + " + valor2 + " = " + soma);

if (valor1 > valor2){
    soma = soma + 2;
    System.out.println(mensagem + valor1 + " > " + valor2);
} else {
    soma = soma - 5;
    System.out.println(mensagem + valor1 + " < " + valor2);
}
}

}