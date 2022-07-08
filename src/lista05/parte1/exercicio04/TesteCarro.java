package parte1.exercicio04;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car1 = new Carro(4, "Onyx", "Chevrolet", 16.0);
        System.out.println("Quantidade de portas: "+car1.qtdPortas+"\nModelo: "+car1.modelo+
                "\nMarca: "+car1.marca+"\nPotência: "+car1.potencia);
    }
}
