package parte1.exercicio02;

public class TesteClasPessoa {
    public static void main(String[] args) {
        //Testando e Instanciando o objeto
        Pessoa pes1 = new Pessoa("Pedro", 25, 71, 1.80);

        System.out.println("Nome: " +pes1.nome + "\nIdade: " +pes1.idade +" anos \nPeso: "+pes1.peso +"" +
                "\nAltura: " +pes1.altura);
    }
}
