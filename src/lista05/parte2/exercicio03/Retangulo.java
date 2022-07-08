package parte2.exercicio03;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public void alterarValorLados(double ladoA, double ladoB){
        System.out.println("Valor de lado A" +ladoA);
        System.out.println("Valor de lado B" +ladoB);
    }

    public String mostrarLados(double ladoA, double ladoB){
        System.out.println("Valor de LadoA "+ this.ladoA);
        System.out.println("Valor de LadoB "+ this.ladoB);
        return null;
    }

    public double calcularPerimetro(){
        double total;
        total = 2 * (ladoA+ladoB);
        return total;
    }
}
