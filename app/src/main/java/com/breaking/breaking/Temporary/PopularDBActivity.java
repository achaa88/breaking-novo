package com.breaking.breaking.Temporary;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.breaking.breaking.R;

public class PopularDBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_db);
    }

    public void onClickPopularBD(View view) {
        SQLiteDatabase db;
        db = openOrCreateDatabase("breaking", MODE_PRIVATE, null);

        //criando tabelas
        //user
        try {

            db.execSQL("CREATE TABLE IF NOT EXISTS user(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, email VARCHAR, password VARCHAR, new_password VARCHAR, cpf INTEGER, matricula INTEGER )");
            //sku
            db.execSQL("CREATE TABLE IF NOT EXISTS sku(ean INTEGER PRIMARY KEY, nome VARCHAR, categoria VARCHAR, quantidade INTEGER, tamanho INTEGER, preco_medio NUMERIC(6,2), data_validade )");
            //pdv
            db.execSQL("CREATE TABLE IF NOT EXISTS pdv(id INTEGER PRIMARY KEY, codigo_canal INTEGER, nome VARCHAR(50), endereco VARCHAR, bandeira VARCHAR, cnpj INTEGER, telefone INTEGER )");
            //perguntas ex sku
            db.execSQL("CREATE TABLE IF NOT EXISTS perguntas_livres(id_execucao INTEGER PRIMARY KEY FOREIGN KEY REFERENCES execucao_sku(id), pergunta VARCHAR(50), resposta VARCHAR(50) )");
            //ex sku
            db.execSQL("CREATE TABLE IF NOT EXISTS solicitacao_execucao_sku(id INTEGER, data DATETIME PRIMARY KEY, id_pdv INTEGER PRIMARY KEY, id_sku INTEGER PRIMARY KEY, id_user INTEGER, pegar_preco BOOLEAN, preco NUMERIC(6,2), pegar_presenca BOOLEAN, presenca BOOLEAN, pegar_estoque, estoque BOOLEAN, FOREIGN KEY (id_pdv) REFERENCES pdv(id), FOREIGN KEY (id_sku) REFERENCES sku(id) )");

            db.execSQL("CREATE TABLE IF NOT EXISTS resultado_execucao_sku(id INTEGER, data DATETIME PRIMARY KEY, preco NUMERIC(6,2),presenca BOOLEAN, estoque BOOLEAN)");

        }catch (SQLiteException e){
            e.printStackTrace();
        }
    }
}
