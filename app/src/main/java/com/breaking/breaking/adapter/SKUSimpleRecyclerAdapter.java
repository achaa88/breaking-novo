package com.breaking.breaking.adapter;

import com.breaking.breaking.domain.SolicitacaoExecucaoSKU;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

/**
 * Created by Vitor on 03/06/2016.
 */
public class SKUSimpleRecyclerAdapter extends FirebaseRecyclerAdapter<SolicitacaoExecucaoSKU,SKUSimpleViewHolder> {

    public SKUSimpleRecyclerAdapter(
            Class<SolicitacaoExecucaoSKU> modelClass,
            int modelLayout,
            Class<SKUSimpleViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass,modelLayout,viewHolderClass,ref);
    }

    @Override
    protected void populateViewHolder(
            SKUSimpleViewHolder skuSimpleViewHolder,
            SolicitacaoExecucaoSKU sku,
            int i) {
        //skuSimpleViewHolder.text1.setText( sku.getNome() );
        //skuSimpleViewHolder.text2.setText(sku.getPrecoAtualString());
    }
}
