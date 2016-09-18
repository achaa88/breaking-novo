package com.breaking.breaking.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vitor on 03/06/2016.
 */
public class SKUSimpleViewHolder extends RecyclerView.ViewHolder {

    public TextView text1;
    //public TextView text2;

    public SKUSimpleViewHolder(View itemView) {
        super(itemView);

        text1 = (TextView) itemView.findViewById(android.R.id.text1);
        //text2 = (TextView) itemView.findViewById(android.R.id.text2);

    }
}
