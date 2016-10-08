package com.breaking.breaking.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitor on 31/07/2016.
 */
public class PDV {

    private String estado;
    private int codigoCanal;
    private String cidade;
    private String bandeira;
    private String enredeco;
    private String bairro;
    private String nome;
    private int cnpj;
    private int telefone;
    private String id;

    public PDV(){}

    public PDV(String nome, int codigo_canal, String bandeira, int cnpj, int telefone, String enredeco, String bairro, String cidade, String estado){
        this.bairro = bairro;
        this.bandeira = bandeira;
        this.cidade = cidade;
        this.cnpj = cnpj;
        this.codigoCanal = codigo_canal;
        this.enredeco = enredeco;
        this.nome = nome;
        this.telefone = telefone;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo_canal() {
        return codigoCanal;
    }

    public void setCodigo_canal(int codigo_canal) {
        this.codigoCanal = codigo_canal;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getEnredeco() {
        return enredeco;
    }

    public void setEnredeco(String enredeco) {
        this.enredeco = enredeco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnderecoCompleto(){
        return(this.enredeco+" "+this.bairro+" "+this.cidade+" "+this.estado);
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("nome",nome);
        map.put("codigoCanal",codigoCanal);
        map.put("bandeira",bandeira);
        map.put("cnpj",cnpj);
        map.put("telefone",telefone);
        map.put("endereco",enredeco);
        map.put("bairro",bairro);
        map.put("cidade",cidade);
        map.put("estado",estado);
        map.put("id",id);
        return map;
    }
}
