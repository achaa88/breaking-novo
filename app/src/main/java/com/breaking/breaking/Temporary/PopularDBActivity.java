package com.breaking.breaking.Temporary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.breaking.breaking.R;

public class PopularDBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_db);
    }
    public void onClickCadastrarPDV(View view){
        Intent intent  = new Intent(this, CadastrarPDVActivity.class);
        startActivity(intent);
    }

    public void onClickCadastrarSKU(View view){
        Intent intent  = new Intent(this, CadastrarSKUActivity.class);
        startActivity(intent);
    }

    public void onClickCadastrarExSKU(View view){
        Intent intent  = new Intent(this, CadastrarSKUActivity.class);
        startActivity(intent);
    }

    public void onClickCadastrarExPDV(View view){
        Intent intent  = new Intent(this, CadastrarSKUActivity.class);
        startActivity(intent);
    }

    public void onClickCadastrarExDiaria(View view){
        Intent intent  = new Intent(this, CadastrarSKUActivity.class);
        startActivity(intent);
    }

    public void onClickPopularBD(View view){
        Intent intent  = new Intent(this, PopularBdTestesActivity.class);
        startActivity(intent);
    }

}
