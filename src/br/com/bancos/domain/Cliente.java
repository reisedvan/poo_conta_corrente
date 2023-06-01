package br.com.bancos.domain;

import java.sql.Date;

public class Cliente extends Pessoa {

    private long id;
    private float rendaBruta;
    private ContaCorrente contaCorrente;
    private final int anoAtual = 2023;
    boolean morto;

    public Cliente() {

    }

    public Cliente(String endereço, float rendaBruta) {

        setEndereço(endereço);
        this.rendaBruta = rendaBruta;

    }

    public Cliente(String nome, String sobrenome, String endereço, int anoAniversario, int mesAniversario,
            int diaAniversario, String sexo, String documento, float rendaBruta) {

        this.rendaBruta = rendaBruta;
        this.contaCorrente = new ContaCorrente();
        this.contaCorrente.cadastrarLimite(rendaBruta);

        setNome(nome);
        setSobrenome(sobrenome);
        setEndereço(endereço);
        setAnoAniversario(anoAniversario);
        setMesAniversario(mesAniversario);
        setDiaAniversario(diaAniversario);
        setDocumento(documento);
        this.morto = false;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public boolean ValidarIdade() {
        return (anoAtual - getAnoAniversario()) >=18;
    }

    public boolean isMorto() {
        return morto;
    }

    public void setMorto(boolean morto) {
        this.morto = morto;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
        atualizarLimite();
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public boolean sacar(int valorSaque) {
        return contaCorrente.sacar(valorSaque);
    }

    public boolean depositar(float valorDeposito) {

        return contaCorrente.creditar(valorDeposito);
    }

    public float consultarLimite() {

        return contaCorrente.verificarLimite();
    }

    public float consultarSaldo() {

        return contaCorrente.verificarSaldo();
    }

    public boolean atualizarLimite() {

        return contaCorrente.cadastrarLimite(rendaBruta);

    }

}
