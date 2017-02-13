package com.breaking.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.breaking.breaking.Temporary.PopularDBActivity;


public class MainActivity extends AppCompatActivity {

    Button btPdvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPdvs = (Button) findViewById(R.id.btPdvs);

    }

    //region onclicks
    public void onClickPdvs(View view){
        Intent intent = new Intent( MainActivity.this, SelecaoPDVActivity.class );
        startActivity( intent );
        finish();
    }
    public void onClickGuiaExecucao(View view){
        Intent intent = new Intent( MainActivity.this, GuiaExecucaoActivity.class );
        startActivity( intent );
        finish();
    }
    public void onClickMensagens(View view){
        Intent intent = new Intent( MainActivity.this, MensagensActivity.class );
        startActivity( intent );
        finish();
    }
    public void onClickRanking(View view){
        Intent intent = new Intent( MainActivity.this, RankingActivity.class );
        startActivity( intent );
        finish();
    }

    public void onClickPopularDB(View view){
        Intent intent = new Intent( MainActivity.this, PopularDBActivity.class );
        startActivity( intent );
        finish();
    }
    //end region

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}