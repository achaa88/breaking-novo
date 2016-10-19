package com.breaking.breaking.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vitor on 31/07/2016.
 */
public class SolicitacaoExecucaoSKU {
    
    private String idPDV;
    private String idUser;
    private int idSKU;
    private boolean pegarPreco;
    private boolean pegarpresenca;
    private boolean pegarestoque;
    private List<String> listaPerguntasLivres;


    public SolicitacaoExecucaoSKU(){   }

    public SolicitacaoExecucaoSKU(String idPdv, String idUser){
        this.idPDV = idPdv;
        this.idUser = idUser;
    }

    public String getIdPdv() {
        return idPDV;
    }

    public void setIdPdv(String idPdv) {
        this.idPDV = idPdv;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPerguntaLivre(int posicao){
        return listaPerguntasLivres.get(posicao);
    }

    public void setPerguntaLivre(String perguntaLivre){ this.listaPerguntasLivres.add(perguntaLivre); }

    public void removePerguntaLivre(int posicao){
        //removeResposta(posicao);
        this.listaPerguntasLivres.remove(posicao);
    }

    /*public String getResposta(int posicao){
        return perguntasComRespostas.get(listaPerguntasLivres.get(posicao));
    }*/

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("pegarPreco",pegarPreco);
        map.put("pegarPresenca",pegarpresenca);
        map.put("pegarEstoque",pegarestoque);
        map.put("listaPerguntasLivres",listaPerguntasLivres);
        return map;
    }
    public List<String> getListaPerguntasLivres() {
        return listaPerguntasLivres;
    }

    public void setListaPerguntasLivres(List<String> listaPerguntasLivres) {
        this.listaPerguntasLivres = listaPerguntasLivres;
    }
    /*
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
    */
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
        return idSKU;
    }

    public void setIdExecucaoSKU(int idExecucaoSKU) {
        this.idSKU = idExecucaoSKU;
    }
    /*
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
    */
}
