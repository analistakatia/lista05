package parte2.exercicio02;

import java.util.Scanner;

public class TesteQuadrado {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do lado: ");
        quadrado.lado = input.nextDouble();
        System.out.println(quadrado.lado);

        System.out.println("Deseja mudar o lado? S/N");
        String resp = input.next();
        if (resp.equalsIgnoreCase("s")){
            quadrado.mudarValorLado();
        }else {
            System.out.println("Obrigada por interagir com nosso sistema!");
        }

        quadrado.retornarValorLado();
        System.out.println("Valor retornado: "+quadrado.retornarValorLado());

        System.out.println("Valor da área é: " + quadrado.calcularArea());
    }
}
