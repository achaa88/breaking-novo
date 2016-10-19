package com.breaking.breaking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.database.DatabaseReference;

public class CheckInPDVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_pdv);
        Bundle extras = getIntent().getExtras();
        TextView tvId = (TextView) findViewById(R.id.tvIdPvd);
        DatabaseReference pvdRef = LibraryClass.getFirebase().child("pdvs");
        if(extras != null){
            String idPdv = extras.getString("idPdv");
            Log.i("LOG","id "+idPdv);
            tvId.setText(idPdv);
        }
        else{
            Log.i("LOG","id nao encontrado");
            tvId.setText("sem id");
        }
    }
}
