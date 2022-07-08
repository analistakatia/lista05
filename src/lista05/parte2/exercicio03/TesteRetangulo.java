package parte2.exercicio03;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        double ladoA = r1.ladoA;
        double ladoB = r1.ladoB;

        System.out.print("Coloque o valor do lado A: ");
        ladoA = input.nextDouble();
        System.out.println("Coloque o valor do lado B: ");
        ladoB = input.nextDouble();

        System.out.println("Valor de A = "+ladoA);
        System.out.println("Valor de B = "+ladoB);

        System.out.print("Deseja alterar o valor dos lados? S/N");
        String usuario = input.next();

        if (usuario.equalsIgnoreCase("s")){
            System.out.print("Novo valor de lado A: ");
            ladoA = input.nextDouble();
            System.out.println("Novo valor de lado B: ");
            ladoB = input.nextDouble();
            r1.alterarValorLados(ladoA, ladoB);
        }else {

        }
        String novo = r1.mostrarLados(ladoA, ladoB);
        System.out.println("Valores atualizados: " +novo);

        double perimetro = r1.calcularPerimetro();
        System.out.println("Calculo do perimetro: "+perimetro);
    }
}
