package parte2.exercicio01;

public class BolaJabulani {
    String cor = "Verde";
    double circunferencia;
    String material;

    public BolaJabulani(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }
    public void trocarCor(String novaCor){
        cor = novaCor;
    }

    public void mostrarCor(String cor){
        System.out.println("Mostrando nova cor");
    }
}
