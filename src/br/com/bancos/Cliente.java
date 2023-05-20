package br.com.bancos;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String endereço;
    private int anoAniversario;
    private int mesAniversario;
    private int diaAniversario;
    private String sexo;
    private String documento;
    private float rendaBruta;
    private ContaCorrente contaCorrente;

    boolean morto;

    public void setAnoAniversario(int anoAniversario) {
        this.anoAniversario = anoAniversario;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getAnoAniversario() {
        return anoAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEndereço() {
        return endereço;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean isMorto() {
        return morto;
    }

    public void setMorto(boolean morto) {
        this.morto = morto;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
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

    public boolean depositar() {

        return contaCorrente.creditar(rendaBruta);
    }

    public float consultarLimite() {

        return contaCorrente.verificarLimite();
    }

    public float consultarSaldo() {

        return contaCorrente.verificarSaldo();
    }

}
