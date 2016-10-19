package com.breaking.breaking.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitor on 19/09/2016.
 */
public class ExecucaoPDV {

    private Map<String,SolicitacaoExecucaoSKU> solicitacaoExecucaoSKU = new HashMap<>();
    private Map<String,ResultadoExecucaoSKU> resultadoExecucaoSKU = new HashMap<>();
    private PDV pdv;
    private String idExPdv;

    public ExecucaoPDV(){}

    public SolicitacaoExecucaoSKU getSolicitacaoExecucaoSKU(String produto){
        return solicitacaoExecucaoSKU.get(produto);
    }

    public void setSolicitacaoExecucaoSKU(String produto,SolicitacaoExecucaoSKU solicitacaoExecucaoSKU){
        this.solicitacaoExecucaoSKU.put(produto,solicitacaoExecucaoSKU);
    }

    public void removeSolicicataoExecucaoSKU(String produto){
        this.solicitacaoExecucaoSKU.remove(produto);
    }

    public ResultadoExecucaoSKU getResultadoExecucaoSKU(String produto){
        return resultadoExecucaoSKU.get(produto);
    }

    public void setResultadoExecucaoSKU(String produto,ResultadoExecucaoSKU resultadoExecucaoSKU){
        this.resultadoExecucaoSKU.put(produto,resultadoExecucaoSKU);
    }

    public void removeResultadoExecucaoSKU(String produto){
        this.resultadoExecucaoSKU.remove(produto);
    }

    public PDV getPdv() {
        return pdv;
    }

    public void setPdv(PDV pdv) {
        this.pdv = pdv;
    }

    public String getIdExPdv() {
        return idExPdv;
    }

    public void setIdExPdv(String idExPdv) {
        this.idExPdv = idExPdv;
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("pdv",pdv);
        map.put("idExPdv",idExPdv);
        map.put("solicitacaoExecucaoSKU",solicitacaoExecucaoSKU);
        map.put("resultadoExecucaoSKU",resultadoExecucaoSKU);
        return map;
    }
}
