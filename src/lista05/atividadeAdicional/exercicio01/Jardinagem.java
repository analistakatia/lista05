package atividadeAdicional.exercicio01;

public class Jardinagem {
    String nomeJardim;
    int qtdPlantas;
    double qtdMetrosGrama = 50;
    double kilosAdubo;
    double valorAdubo = 2.90;
    double valorMetroGrama = 5.00;
    double valorCorteGrama;

    public Jardinagem(String nomeJardim) {
        this.nomeJardim = nomeJardim;
    }

    public double usarAdubo() {

        return (this.qtdMetrosGrama / 2) * 100;
    }

    public double precoAdubo() {

        return usarAdubo() * this.valorAdubo;
    }

    public double precoCorteGrama() {
        this.valorCorteGrama = this.qtdMetrosGrama * this.valorMetroGrama;
        return this.valorCorteGrama;
    }
}
