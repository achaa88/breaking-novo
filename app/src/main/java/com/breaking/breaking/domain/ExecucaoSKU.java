package com.breaking.breaking.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vitor on 31/07/2016.
 */
public class ExecucaoSKU {

    private PDV pdv;
    private User user;
    private SKU sku;
    private int idExecucaoSKU;
    private boolean pegarPreco;
    private double preco;
    private boolean pegarpresenca;
    private int presenca; //porcent
    private boolean pegarestoque;
    private int estoque; //porcent
    private List<String> listaPerguntasLivres;
    private Map<String,String> perguntasComRespostas = new HashMap<>();


    public ExecucaoSKU(){   }

    public ExecucaoSKU(PDV pdv,SKU sku){
        this.pdv = pdv;
        this.sku = sku;
    }
    public String getPerguntaLivre(int posicao){
        return listaPerguntasLivres.get(posicao);
    }
    public void setPerguntaLivre(String perguntaLivre){
        this.listaPerguntasLivres.add(perguntaLivre);
    }

    public void removePerguntaLivre(int posicao){
        removeResposta(posicao);
        this.listaPerguntasLivres.remove(posicao);
    }

    public String getResposta(int posicao){
        return perguntasComRespostas.get(listaPerguntasLivres.get(posicao));
    }

    public PDV getPdv() {
        return pdv;
    }

    public void setPdv(PDV pdv) {
        this.pdv = pdv;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public List<String> getListaPerguntasLivres() {
        return listaPerguntasLivres;
    }

    public void setListaPerguntasLivres(List<String> listaPerguntasLivres) {
        this.listaPerguntasLivres = listaPerguntasLivres;
    }

    public Map<String, String> getPerguntasComRespostas() {
        return perguntasComRespostas;
    }

    public void setPerguntasComRespostas(Map<String, String> perguntasComRespostas) {
        this.perguntasComRespostas = perguntasComRespostas;
    }

    public void setResposta(int posPerg, String resposta){
        this.perguntasComRespostas.put(this.listaPerguntasLivres.get(posPerg),resposta);
    }

    public void removeResposta(int posPerg){
        this.perguntasComRespostas.remove(this.listaPerguntasLivres.get(posPerg));
    }

    public boolean isPegarpresenca() {
        return pegarpresenca;
    }

    public void setPegarpresenca(boolean pegarpresenca) {
        this.pegarpresenca = pegarpresenca;
    }

    public boolean isPegarestoque() {
        return pegarestoque;
    }

    public void setPegarestoque(boolean pegarestoque) {
        this.pegarestoque = pegarestoque;
    }

    public boolean isPegarPreco() {
        return pegarPreco;
    }

    public void setPegarPreco(boolean pegarPreco) {
        this.pegarPreco = pegarPreco;
    }

    public int getIdExecucaoSKU() {
        return idExecucaoSKU;
    }

    public void setIdExecucaoSKU(int idExecucaoSKU) {
        this.idExecucaoSKU = idExecucaoSKU;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
