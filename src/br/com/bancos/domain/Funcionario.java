/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancos.domain;

/**
 *
 * @author Supervisor
 */
public class Funcionario extends Pessoa {

    long id;
    private String documentoCtps;
    private String numeroDeRegistro;
    private String dataRegistro;
    private String cargo;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String endereço, int anoDeAniversario, int diaDeAniversario,
            int mesdeAniversario, String documentosCtps, String numeroDeRegistro,
            String dataDeRegistro, String cargo, float salario) {

        setNome(nome);
        setSobrenome(sobrenome);
        setEndereço(endereço);
        setAnoAniversario(anoDeAniversario);
        setDiaAniversario(diaDeAniversario);
        setMesAniversario(mesdeAniversario);
        this.cargo = cargo;
        this.dataRegistro = dataDeRegistro;
        this.documentoCtps = documentosCtps;
        this.numeroDeRegistro = numeroDeRegistro;
        this.salario = salario;

    }

    public String getCargo() {
        return cargo;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public String getDocumentoCtps() {
        return documentoCtps;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public float getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public void setDocumentoCtps(String documentoCtps) {
        this.documentoCtps = documentoCtps;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void promocaoFuncionario(String novoCargo, float novoSalario) {

        this.salario = novoSalario;
        this.cargo = novoCargo;

    }

    public void dicidio(float percentualAjusteDicidio) {

        this.salario = this.salario * percentualAjusteDicidio;

    }

}
