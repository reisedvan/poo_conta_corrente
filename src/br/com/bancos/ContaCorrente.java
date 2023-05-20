package br.com.bancos;

public class ContaCorrente {

    float saldo;
    float credito;
    float debito;
    float limite;

    public float verificarSaldo() {

        return saldo;
    }

    public boolean cadastrarLimite(float rendaBruta) {

        if (rendaBruta <= 0) {
            return false;
        }

        limite = (float) (rendaBruta * 0.30);
        return true;

    }

    public float verificarLimite() {

        return limite;
    }

    public boolean sacar(float valorSaque) {
        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
            return true;

        }

        return false;
    }

    public boolean creditar(float valorDeposito) {
        if (valorDeposito > 0) {
            saldo = saldo + valorDeposito;
            return true;
        }

        return false;

    }

}
