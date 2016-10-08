package com.breaking.breaking.adapter;

import com.breaking.breaking.domain.ExecucaoSKU;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

/**
 * Created by Vitor on 03/06/2016.
 */
public class SKUSimpleRecyclerAdapter extends FirebaseRecyclerAdapter<ExecucaoSKU,SKUSimpleViewHolder> {

    public SKUSimpleRecyclerAdapter(
            Class<ExecucaoSKU> modelClass,
            int modelLayout,
            Class<SKUSimpleViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass,modelLayout,viewHolderClass,ref);
    }

    @Override
    protected void populateViewHolder(
            SKUSimpleViewHolder skuSimpleViewHolder,
            ExecucaoSKU sku,
            int i) {
        //skuSimpleViewHolder.text1.setText( sku.getNome() );
        //skuSimpleViewHolder.text2.setText(sku.getPrecoAtualString());
    }
}
