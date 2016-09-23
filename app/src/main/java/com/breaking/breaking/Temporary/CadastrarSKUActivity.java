package com.breaking.breaking.Temporary;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.breaking.breaking.R;
import com.breaking.breaking.domain.SKU;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class CadastrarSKUActivity extends AppCompatActivity implements DatabaseReference.CompletionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_sku);
    }
    public void OnClickEnviarCadastro(View view){
        EditText nome = (EditText) findViewById(R.id.etNomeSKU);
        EditText ean = (EditText) findViewById(R.id.etEanSKU);
        EditText categoria = (EditText) findViewById(R.id.CategoriaSKU);
        EditText quantidade = (EditText) findViewById(R.id.etQuantidadeSKU);
        EditText tamanho = (EditText) findViewById(R.id.etTamanhoGondulaSKU);
        EditText preco_medio = (EditText) findViewById(R.id.etPrecoMedioSKU);
        EditText data_validade = (EditText) findViewById(R.id.etDataValidadeSKU);

        DatabaseReference novoSKUref = LibraryClass.getFirebase().child("skus").push();
        Map<String,Object> map = new HashMap<>();

        SKU sku = new SKU();
        sku.setNome(nome.getText().toString());
        sku.setEan(Integer.parseInt(ean.getText().toString()));
        sku.setCategoria(categoria.getText().toString());
        sku.setQuantidade(Integer.parseInt(quantidade.getText().toString()));
        sku.setTamanho(Integer.parseInt(tamanho.getText().toString()));
        sku.setPreco_medio(Double.parseDouble(preco_medio.getText().toString()));
        sku.setData_validade(data_validade.getText().toString());

        map = sku.toMap();
        String key = novoSKUref.getKey();
        novoSKUref.setValue(map,this);
    }

    @Override
    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
        if(databaseError==null)
            showToast("SKU Criado com sucesso");
        else
            showToast("erro ao criar sku "+databaseError.getMessage());
    }

    protected void showToast( String message ){
        Toast.makeText(this,
                message,
                Toast.LENGTH_LONG)
                .show();
    }
}
