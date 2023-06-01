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
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String endereço;
    private int anoAniversario;
    private int mesAniversario;
    private int diaAniversario;
    private String sexo;
    private String documento;

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

    public void setAnoAniversario(int anoAniversario) {
        this.anoAniversario = anoAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
}
