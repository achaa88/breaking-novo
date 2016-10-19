package com.breaking.breaking.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.breaking.breaking.Interface.RecyclerViewOnClickListenerHack;
import com.breaking.breaking.R;

/**
 * Created by ellen2 on 23/09/2016.
 */

public class ExPdvViewHolder extends RecyclerView.ViewHolder{
    public ImageView logo;
    public TextView bandeira;
    public TextView nome;
    public TextView endereco;
    public TextView id;
    public View view;
    public RecyclerViewOnClickListenerHack listenerHack;
    public FragmentActivity fragmentActivity;

    public ExPdvViewHolder(View itemView) {
        super(itemView);
        logo = (ImageView) itemView.findViewById(R.id.ivPvd);
        bandeira = (TextView) itemView.findViewById(R.id.tvBandeira);
        nome = (TextView) itemView.findViewById(R.id.tvNomePdv);
        endereco = (TextView) itemView.findViewById(R.id.tvEndereco);
        id = (TextView) itemView.findViewById(R.id.tvId);
        //itemView.setOnClickListener(this);
        view = itemView;
    }
    public void addOnClickListener(View.OnClickListener listener){
        view.setOnClickListener(listener);
    }
    public void setActivity(FragmentActivity f){

    }

    /*public void setListenerHack(RecyclerViewOnClickListenerHack r){
        listenerHack = r;
    }

    @Override
    public void onClick(View view) {
        if(listenerHack != null){
            listenerHack.onClickListener(view,getAdapterPosition());
        }
    }*/
}
