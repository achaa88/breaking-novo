package com.breaking.breaking.domain;

/**
 * Created by Vitor on 31/07/2016.
 */
public class ExecucaoSKU {

    private int dia_semana;
    private String pdv;
    private boolean preco;
    private boolean presenca;
    private boolean estoque;

    public ExecucaoSKU(){   }
    public ExecucaoSKU(int dia_semana,String pdv){
        this.dia_semana = dia_semana;
        this.pdv = pdv;
    }

    public int getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(int dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getPdv() {
        return pdv;
    }

    public void setPdv(String pdv) {
        this.pdv = pdv;
    }

    public boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public boolean getEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }

    public boolean getPreco() {
        return preco;
    }

    public void setPreco(boolean preco) {
        this.preco = preco;
    }
}
