package com.breaking.breaking.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;

import com.breaking.breaking.CheckInPDVActivity;
import com.breaking.breaking.Interface.RecyclerViewOnClickListenerHack;
import com.breaking.breaking.domain.ExecucaoPDV;
import com.breaking.breaking.domain.PDV;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

/**
 * Created by ellen2 on 23/09/2016.
 */

public class ExPdvRecyclerAdapter extends FirebaseRecyclerAdapter<ExecucaoPDV,ExPdvViewHolder> {
    FragmentActivity fragmentActivity;
    private String idPdv;
    private RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack;

    public ExPdvRecyclerAdapter(
            Class<ExecucaoPDV> modelClass,
            int modelLayout,
            Class<ExPdvViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder(
            final ExPdvViewHolder viewHolder,
            final ExecucaoPDV model,
            int position) {
        final PDV pdv = model.getPdv();
        viewHolder.bandeira.setText(pdv.getBandeira());
        viewHolder.nome.setText(pdv.getNome());
        viewHolder.endereco.setText(pdv.getEnderecoCompleto());
        idPdv = pdv.getId();
        viewHolder.id.setText(idPdv);
        viewHolder.addOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fragmentActivity, CheckInPDVActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("idPvd",viewHolder.id.getText().toString());
                Log.i("LOG", "setando onClick de id "+viewHolder.id.getText().toString());
                intent.putExtras(bundle);
                fragmentActivity.startActivity(intent);
            }
        });


    }
    public void setActivity(FragmentActivity f){
        fragmentActivity = f;
    }

    /*public String getIdPvd() {
        return idPvd;
    }*/
}
