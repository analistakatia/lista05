package atividadeAdicional.exercicio01;

public class TesteJardinagem {
    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem("Felicidade");

        System.out.println("O Jardim " +jardim.nomeJardim + " possui " +jardim.qtdMetrosGrama + " mts de grama.");

        jardim.usarAdubo();
        System.out.println("Para essa quantidade de grama, deverão ser utilizados " + jardim.usarAdubo() +" kgs de adubos.");

        jardim.precoAdubo();
        System.out.println("O valor do adubo a ser pago para essa quantidade de grama é de R$ " + jardim.precoAdubo());

        jardim.precoCorteGrama();
        System.out.println("O valor a ser pago para o corte de toda essa grama será de R$ " +jardim.precoCorteGrama());


    }

}


