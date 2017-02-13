package com.breaking.breaking.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.breaking.breaking.ExecucaoPDVActivity;
import com.breaking.breaking.R;

/**
 * Created by Vitor on 03/06/2016.
 */
public class PDVViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView bandeira;
    public TextView endereco;
    public TextView nome;
    public TextView id;
    Context context;
    public final String ID = "ID";


    public PDVViewHolder(View itemView, Context context) {
        super(itemView);

        //titulo = (TextView) itemView.findViewById(android.R.id.text1);
        //endereco = (TextView) itemView.findViewById(android.R.id.);
        //logo = text1 = (TextView) itemView.findViewById(android.R.id.);
        nome = (TextView) itemView.findViewById(R.id.tvNomePdv);
        endereco = (TextView) itemView.findViewById(R.id.tvEndereco);
        bandeira = (TextView) itemView.findViewById(R.id.tvBandeira);
        id = (TextView) itemView.findViewById(R.id.tvId);
        this.context = context;
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context,ExecucaoPDVActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(ID,id.getText().toString());
        intent.putExtra("BUNDLE",bundle);
        context.startActivity(intent);
    }
}
