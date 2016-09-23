package com.breaking.breaking.Temporary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.breaking.breaking.R;
import com.breaking.breaking.domain.PDV;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class CadastrarPDVActivity extends AppCompatActivity implements DatabaseReference.CompletionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_pdv);
    }

    public void OnclickCadastrarPDV(View view){
        EditText nome = (EditText) findViewById(R.id.etNome);
        EditText codigo_canal = (EditText) findViewById(R.id.etCodigoCanal);
        EditText bandeira = (EditText) findViewById(R.id.etBandeira);
        EditText cnpj = (EditText) findViewById(R.id.etCnpj);
        EditText telefone = (EditText) findViewById(R.id.etTelefone);
        EditText endereco = (EditText) findViewById(R.id.etEndereco);
        EditText bairro = (EditText) findViewById(R.id.etBairro);
        EditText cidade = (EditText) findViewById(R.id.etCidade);
        EditText estado = (EditText) findViewById(R.id.etEstado);

        DatabaseReference pdvReference = LibraryClass.getFirebase().child("pdvs");
        DatabaseReference novoPdvRef = pdvReference.push();
        Map<String,Object> map = new HashMap<>();

        PDV pdv = new PDV(nome.getText().toString(),Integer.parseInt(codigo_canal.getText().toString()),bandeira.getText().toString(),Integer.parseInt(cnpj.getText().toString()),Integer.parseInt(telefone.getText().toString()),endereco.getText().toString(),bairro.getText().toString(),cidade.getText().toString(),estado.getText().toString());
        //PDV pdv = new PDV("pdv",321,"extra",)
        map = pdv.toMap();
        String key = novoPdvRef.getKey();
        pdv.setId(key);
        novoPdvRef.setValue(map,this);

    }
    protected void showToast( String message ){
        Toast.makeText(this,
                message,
                Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
        if(databaseError==null)
            showToast("PDV Criado com sucesso");
        else
            showToast("erro ao criar pdv "+databaseError.getMessage());
        //finish();
    }
}
