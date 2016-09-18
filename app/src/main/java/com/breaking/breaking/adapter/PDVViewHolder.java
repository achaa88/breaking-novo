package com.breaking.breaking.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vitor on 03/06/2016.
 */
public class PDVViewHolder extends RecyclerView.ViewHolder {

    public TextView titulo;
    public TextView endereco;
    //public ImageView logo;

    public PDVViewHolder(View itemView) {
        super(itemView);

        titulo = (TextView) itemView.findViewById(android.R.id.text1);
        endereco = (TextView) itemView.findViewById(android.R.id.text2);
        //logo = text1 = (TextView) itemView.findViewById(android.R.id.);
    }
}
