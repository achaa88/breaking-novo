package com.breaking.breaking.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.breaking.breaking.R;

/**
 * Created by ellen2 on 23/09/2016.
 */

public class ExPdvViewHolder extends RecyclerView.ViewHolder{
    public ImageView logo;
    public TextView bandeira;
    public TextView nome;
    public TextView endereco;

    public ExPdvViewHolder(View itemView) {
        super(itemView);
        logo = (ImageView) itemView.findViewById(R.id.ivPvd);
        bandeira = (TextView) itemView.findViewById(R.id.tvBandeira);
        nome = (TextView) itemView.findViewById(R.id.tvNomePdv);
        endereco = (TextView) itemView.findViewById(R.id.tvEndereco);
    }
}
