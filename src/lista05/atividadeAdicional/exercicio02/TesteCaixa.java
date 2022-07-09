package atividadeAdicional.exercicio02;

import java.util.Scanner;

public class TesteCaixa {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        System.out.printf("Seu saldo inicial é de R$ %.2f", caixa.saldo);

        Scanner input = new Scanner(System.in);
        System.out.print("\nQuantos lançamentos você deseja fazer? ");
        int lançamento = input.nextInt();

        for (int i = 1; i <= lançamento; i++){
            System.out.println("Creditar ou debitar? C/D");
            String resp = input.next();

            if (resp.equalsIgnoreCase("C")){
                System.out.println("Digite o valor a ser creditado em sua conta: R$ ");
                double credito = input.nextDouble();
                caixa.creditarGrana();
            }else {
                System.out.println("Digite o valor a ser debitado em sua conta: R$ ");
                double debito = input.nextDouble();
                caixa.debitarGrana();
            }
        }
        caixa.mostrarSaldo();
        System.out.println("Seu saldo atual é de R$ " + caixa.mostrarSaldo());
    }
}
