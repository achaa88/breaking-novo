package com.breaking.breaking.domain;

/**
 * Created by Vitor on 31/07/2016.
 */
public class ExecucaoLivreSKU {
    private int dia_semana;
    private String pdv;
    private String sku;

    public ExecucaoLivreSKU(){ }

    public ExecucaoLivreSKU(String pdv,String sku,int dia_semana){
        this.dia_semana = dia_semana;
        this.sku = sku;
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
