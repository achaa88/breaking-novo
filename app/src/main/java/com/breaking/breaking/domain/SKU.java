package com.breaking.breaking.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitor on 31/07/2016.
 */
public class SKU {

    private int ean;
    private String nome;
    private String categoria;
    private int quantidade;
    private int tamanho; //tamanho na gondula
    private double preco_medio;
    private String data_validade;

    public SKU(){}

    public int getEan() {
        return ean;
    }

    public void setEan(int ean) {
        this.ean = ean;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_medio() {
        return preco_medio;
    }

    public void setPreco_medio(double preco_medio) {
        this.preco_medio = preco_medio;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("nome",nome);
        map.put("ean",ean);
        map.put("categoria",categoria);
        map.put("quantidade",quantidade);
        map.put("tamanho",tamanho);
        map.put("precoMedio",preco_medio);
        map.put("dataValidade",data_validade);

        return map;
    }
}
