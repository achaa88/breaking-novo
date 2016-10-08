package com.breaking.breaking.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vitor on 19/09/2016.
 */
public class ExecucaoDiaria {
    private Map<String,ExecucaoPDV> execucaoPDVMap = new HashMap<>();
    private String data;

    public ExecucaoDiaria(){}

    public ExecucaoDiaria(String data){
        //this.user = user;
        this.data = data;
    }

    public ExecucaoPDV getExecucaoPDV(String pdv){
        return execucaoPDVMap.get(pdv);
    }
    public void setExecucaoPDV(String pdv, ExecucaoPDV execucaoPDV){
        this.execucaoPDVMap.put(pdv,execucaoPDV);
    }

    public void removeExecucaoPDV(String pdv){
        this.execucaoPDVMap.remove(pdv);
    }

    public Map<String, ExecucaoPDV> getExecucaoPDVMap() {
        return execucaoPDVMap;
    }

    public void setExecucaoPDVMap(Map<String, ExecucaoPDV> execucaoPDVMap) {
        this.execucaoPDVMap = execucaoPDVMap;
    }
}