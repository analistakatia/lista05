package parte2.exercicio01;

import java.util.Scanner;

public class TesteBolaJabulani {
    public static void main(String[] args) {
        //Innstanciando o objeto com a primeira opção de cor
        BolaJabulani testeBola = new BolaJabulani("Verde", 65.0, "Sintético");
        System.out.println("*** Bola Jabulani ***");
        System.out.println("Cor: "+testeBola.cor+"\nTamanho: "+testeBola.circunferencia+"\nMaterial: "+testeBola.material);


        String mostraCor = testeBola.cor;
        System.out.println("Cor inicial: "+mostraCor);

        testeBola.trocarCor("Rosa");
        System.out.println("Nova cor: " +testeBola.cor);

        mostraCor = testeBola.cor;
        System.out.println("Cor anterior: "+mostraCor);

        testeBola.trocarCor("Azul");
        System.out.println("Nova cor: " +testeBola.cor);
    }
}
