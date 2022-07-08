package parte1.exercicio03;

public class TesteCtaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("11111-X", "Jose Silva", 109.90);
        System.out.println("Nº Conta: " +conta1.numConta + "\nNome do Correntista: " +conta1.nomeCorrent + "\nSaldo: " +conta1.saldo);

    }
}
