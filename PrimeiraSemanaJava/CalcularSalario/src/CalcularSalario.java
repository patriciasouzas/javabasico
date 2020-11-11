public class CalcularSalario {

    public static void main(String[] args) {

        float salario = 1500;
        float totalVendas = 300;
        float comissao = (totalVendas/100)*10;
        float salarioTotal = salario + comissao;

        System.out.printf("Seu salario somado com a comissao eh: R$ %.2f", salarioTotal);
        
    }
}