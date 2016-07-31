package com.breaking.breaking.domain;

/**
 * Created by Vitor on 31/07/2016.
 */
public class PDV {

    public String estado;
    public int codigo_canal;
    public String cidade;
    public String bandeira;
    public String enredeco;
    public String bairro;
    public int cnpj;
    public int telefone;

    public PDV(){}

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo_canal() {
        return codigo_canal;
    }

    public void setCodigo_canal(int codigo_canal) {
        this.codigo_canal = codigo_canal;
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


}
