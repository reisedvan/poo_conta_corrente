package br.com.bancos.domain;

import java.sql.Date;

public class Cliente {

    private long id;
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
    private final int anoAtual = 2023;
    boolean morto;

    public Cliente() {

    }

    public Cliente(String endereço, float rendaBruta) {

        this.endereço = endereço;
        this.rendaBruta = rendaBruta;

    }

    public Cliente(String nome, String sobrenome, String endereço, int anoAniversario, int mesAniversario,
            int diaAniversario, String sexo, String documento, float rendaBruta) {

        this.rendaBruta = rendaBruta;
        this.contaCorrente = new ContaCorrente();
        this.contaCorrente.cadastrarLimite(rendaBruta);

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereço = endereço;
        this.anoAniversario = anoAniversario;
        this.mesAniversario = mesAniversario;
        this.diaAniversario = diaAniversario;
        this.sexo = sexo;
        this.documento = documento;
        this.morto = false;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAnoAniversario(int anoAniversario) {
        this.anoAniversario = anoAniversario;
    }

    public boolean setNascimento(int ano, int mes, int dia) {
        setAnoAniversario(ano);
        setDiaAniversario(dia);
        setMesAniversario(mes);
        return true;
    }

    public boolean validarIdade() {
        return (anoAtual - anoAniversario) >= 18;
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
