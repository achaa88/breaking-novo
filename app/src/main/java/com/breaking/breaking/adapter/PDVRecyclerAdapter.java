package com.breaking.breaking.adapter;

import com.breaking.breaking.domain.PDV;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

/**
 * Created by Vitor on 03/06/2016.
 */
public class PDVRecyclerAdapter extends FirebaseRecyclerAdapter<PDV, PDVViewHolder> {

    public PDVRecyclerAdapter(
            Class<PDV> modelClass,
            int modelLayout,
            Class<PDVViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }


    @Override
    protected void populateViewHolder(PDVViewHolder pdvViewHolder, PDV pdv, int i) {
        pdvViewHolder.titulo.setText( pdv.getNome() );
        pdvViewHolder.endereco.setText(pdv.getEnredeco());
    }
}
