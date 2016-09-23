package com.breaking.breaking.adapter;

import com.breaking.breaking.domain.ExecucaoPDV;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

/**
 * Created by ellen2 on 23/09/2016.
 */

public class ExPdvRecyclerAdapter extends FirebaseRecyclerAdapter<ExecucaoPDV,ExPdvViewHolder> {

    public ExPdvRecyclerAdapter(
            Class<ExecucaoPDV> modelClass,
            int modelLayout,
            Class<ExPdvViewHolder> viewHolderClass,
            Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder(ExPdvViewHolder viewHolder, ExecucaoPDV model, int position) {

    }
}
