package atividadeAdicional.exercicio02;

public class Caixa {
    double saldo;
    double credito;
    double debito;

    public Caixa() {
        this.saldo = 1000;
        this.credito = credito;
        this.debito = debito;
    }
    public double creditarGrana(){
        double entrada = saldo + credito;
        return entrada;
    }

    public double debitarGrana(){
        double saida = saldo - debito;
        return saida;
    }

    public double mostrarSaldo(){
        double saldoAtual = saldo + (credito - debito);
        return mostrarSaldo();
    }



}
