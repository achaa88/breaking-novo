package com.breaking.breaking;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.breaking.breaking.domain.User;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    //private UserRecyclerAdapter adapter;
    private FirebaseAuth.AuthStateListener authStateListener;
    Button btPdvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if( firebaseAuth.getCurrentUser() == null  ){
                    Intent intent = new Intent( MainActivity.this, LoginActivity.class );
                    startActivity( intent );
                    finish();
                }
            }
        };
        btPdvs = (Button) findViewById(R.id.btPdvs);
        
        mAuth = FirebaseAuth.getInstance();
        mAuth.addAuthStateListener( authStateListener );
        databaseReference = LibraryClass.getFirebase();
    }

    public void onClickPdvs(View view){
        Intent intent = new Intent( MainActivity.this, ListaRotaActivity.class );
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


    @Override
    protected void onResume() {
        super.onResume();
        init();
    }

    private void init(){
        /*RecyclerView rvUsers = (RecyclerView) findViewById(R.id.rv_users);
        rvUsers.setHasFixedSize( true );
        rvUsers.setLayoutManager( new LinearLayoutManager(this));
        adapter = new UserRecyclerAdapter(
                User.class,
                android.R.layout.two_line_list_item,
                UserViewHolder.class,
                databaseReference.child("users") );
        rvUsers.setAdapter(adapter);*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //adapter.cleanup();

        if( authStateListener != null ){
            mAuth.removeAuthStateListener( authStateListener );
        }
    }


    // MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        User user = new User();

        if( user.isSocialNetworkLogged( this ) ){
            getMenuInflater().inflate(R.menu.menu_social_network_logged, menu);
        }
        else{
            getMenuInflater().inflate(R.menu.menu, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        /*if(id == R.id.action_update){
            startActivity(new Intent(this, UpdateActivity.class));
        }
        else if(id == R.id.action_update_login){
            startActivity(new Intent(this, UpdateLoginActivity.class));
        }
        else if(id == R.id.action_update_password){
            startActivity(new Intent(this, UpdatePasswordActivity.class));
        }
        else if(id == R.id.action_link_accounts){
            startActivity(new Intent(this, LinkAccountsActivity.class));
        }
        else if(id == R.id.action_remove_user){
            startActivity(new Intent(this, RemoveUserActivity.class));
        }
        else*/ if(id == R.id.action_logout){
            FirebaseAuth.getInstance().signOut();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}