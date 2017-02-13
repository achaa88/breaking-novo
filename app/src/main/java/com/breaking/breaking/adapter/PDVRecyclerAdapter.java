package com.breaking.breaking.adapter;

    import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.breaking.breaking.R;
import com.breaking.breaking.domain.PDV;

import java.util.List;

/**
 * Created by Vitor on 03/06/2016.
 */
public class PDVRecyclerAdapter extends RecyclerView.Adapter<PDVViewHolder> {

    private List<PDV> pdvList;
    private Context context;

    public PDVRecyclerAdapter(List<PDV> pdvList, Context context) {
        this.pdvList = pdvList;
        this.context = context;
    }


    @Override
    public PDVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pdv, parent, false);
        return new PDVViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(PDVViewHolder holder, int position) {
        PDV pdv = pdvList.get(position);
        holder.nome.setText(pdv.getNome());
        holder.endereco.setText(pdv.getEnderecoCompleto());
        holder.bandeira.setText(pdv.getBandeira());
        holder.id.setText(pdv.getId());
    }


    @Override
    public int getItemCount() {
        return pdvList.size();
    }

}
