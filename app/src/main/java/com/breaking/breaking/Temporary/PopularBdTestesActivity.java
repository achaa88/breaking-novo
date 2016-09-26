package com.breaking.breaking.Temporary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.breaking.breaking.R;
import com.breaking.breaking.domain.ExecucaoDiaria;
import com.breaking.breaking.domain.ExecucaoPDV;
import com.breaking.breaking.domain.ExecucaoSKU;
import com.breaking.breaking.domain.PDV;
import com.breaking.breaking.domain.SKU;
import com.breaking.breaking.domain.User;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class PopularBdTestesActivity extends AppCompatActivity {
    protected FirebaseAuth mAuth;
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_bd_testes);

    }
    public void onClickPopularBd(View view){
        DatabaseReference refPrincipal = LibraryClass.getFirebase();
        DatabaseReference refPdvs = refPrincipal.child("pdvs");
        DatabaseReference refSkus = refPrincipal.child("skus");
        DatabaseReference refExDiaria = refPrincipal.child("execucaoDiaria");
        DatabaseReference refExPdv = refPrincipal.child("execucaoPdv");
        DatabaseReference refExsku = refPrincipal.child("execucaoSku");


        user.setId( FirebaseAuth.getInstance().getCurrentUser().getUid() );

        int num_pdvs = 6;
        String nome_pdv = "pdv";
        String bandeira_pdv = "bandeira";
        String endereco_pdv = "endereco";
        String bairro_pdv = "bairro";
        String cidade_pdv = "cidade";
        String estado_pdv = "estado";

        Map<String,PDV> map_pdv = new HashMap<>();
        Map<String,SKU> map_sku = new HashMap<>();

        for (int i=0;i<num_pdvs;i++){
            PDV pdv = new PDV(nome_pdv+i,i,bandeira_pdv+i,i,i,endereco_pdv+i,bairro_pdv+i,cidade_pdv+i,estado_pdv+i);
            map_pdv.put("pdv"+i,pdv);
            DatabaseReference ref_novo_pdv = refPdvs.child("pdv"+i);
            ref_novo_pdv.setValue(pdv.toMap());
        }

        int num_skus = 10;
        String nome_sku = "sku";
        String categoria_sku = "categoria";
        String data_val_sku = "data val";

        for(int i=0;i<num_skus;i++){
            SKU sku = new SKU();
            sku.setPreco_medio(i);
            sku.setTamanho(i);
            sku.setQuantidade(i);
            sku.setNome(nome_sku+i);
            sku.setCategoria(categoria_sku+i);
            sku.setEan(i);
            sku.setData_validade(data_val_sku+i);
            map_sku.put("sku"+i,sku);

            DatabaseReference ref_novo_sku = refSkus.child("sku"+i);
            ref_novo_sku.setValue(sku.toMap());
        }

        String execucao_sku = "execucaoSku";
        String execucao_pdv = "execucaoPdv";

        ExecucaoDiaria execucaoDiaria = new ExecucaoDiaria("data0");

        for (int i=0;i<num_pdvs;i++){
            PDV pdv_atual = map_pdv.get("pdv"+i);
            ExecucaoPDV execucaoPDV = new ExecucaoPDV();
            for(int i2=0;i2<num_skus;i2++){
                ExecucaoSKU execucaoSKU = new ExecucaoSKU();
                execucaoPDV.setExecucaoSKU(execucao_sku+i2,execucaoSKU);
                refExsku.child("pdv"+i2).child("sku"+i2).setValue(execucaoSKU.toMap());
            }
            execucaoDiaria.setExecucaoPDV(execucao_pdv+i,execucaoPDV);
            refExPdv.child("pdv"+i).setValue(execucaoPDV);
        }

        refExDiaria.child(user.getId()).child("data0").setValue(execucaoDiaria);
    }
}
