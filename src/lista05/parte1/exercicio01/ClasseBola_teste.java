package parte1.exercicio01;

public class ClasseBola_teste {
    public static void main(String[] args) {
        ClasseBola futebol = new ClasseBola();
        futebol.cor = "Branca";
        futebol.circunferencia = 68;
        futebol.marca = "Penalty";
        futebol.velocidade = 100;

        System.out.println("Informações - Bola de Futebol");
        System.out.println("Cor: " + futebol.cor);
        System.out.println("Possui em média " + futebol.circunferencia + " de diâmetro");
        System.out.println("Marca: " + futebol.marca);
        System.out.println("Pode chegar até a " +futebol.velocidade + " kms/hr");


        //Testando a instância de outro objeto
        ClasseBola voley = new ClasseBola();
        voley.cor = "Amarela";
        voley.circunferencia = 65;
        voley.marca = "Mykasa";
        voley.velocidade = 130;

        System.out.println("Informações - Bola de Voley");
        System.out.println("Cor: " + voley.cor);
        System.out.println("Possui em média " + voley.circunferencia + " de diâmetro");
        System.out.println("Marca: " + voley.marca);
        System.out.println("Pode chegar até a " +voley.velocidade + " kms/hr");
    }
}
