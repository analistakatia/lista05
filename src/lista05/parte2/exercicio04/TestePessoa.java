package parte2.exercicio04;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José Silva", 25, 72.9, 1.75);

        p1.engordar(4);
        p1.emagrecer(2);
        p1.pessoaApresentar();

        //p1.pessoaApresentar();

        p1.envelhecer();
    }

    }

