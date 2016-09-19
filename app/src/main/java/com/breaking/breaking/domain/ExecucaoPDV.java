package com.breaking.breaking.domain;

import java.util.Map;

/**
 * Created by Vitor on 19/09/2016.
 */
public class ExecucaoPDV {

    private Map<String,ExecucaoSKU> execucaoSKUMap;
    private PDV pdv;
    private User user;

    public ExecucaoPDV(){}

    public ExecucaoPDV(PDV pdv,User user){
        this.pdv = pdv;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PDV getPdv() {
        return pdv;
    }

    public void setPdv(PDV pdv) {
        this.pdv = pdv;
    }

    public Map<String, ExecucaoSKU> getExecucaoSKUMap() {
        return execucaoSKUMap;
    }

    public void setExecucaoSKUMap(Map<String, ExecucaoSKU> execucaoSKUMap) {
        this.execucaoSKUMap = execucaoSKUMap;
    }

    public ExecucaoSKU getExecucaoSKU(String produto){
        return execucaoSKUMap.get(produto);
    }

    public void setExecucaoSKU(String produto,ExecucaoSKU execucaoSKU){
        this.execucaoSKUMap.put(produto,execucaoSKU);
    }

    public void removeExecucaoSKU(String produto){
        this.execucaoSKUMap.remove(produto);
    }

}
