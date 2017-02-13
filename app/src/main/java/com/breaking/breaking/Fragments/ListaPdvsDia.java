package com.breaking.breaking.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.breaking.breaking.R;
import com.breaking.breaking.adapter.PDVRecyclerAdapter;
import com.breaking.breaking.domain.PDV;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ListaPdvsDia extends Fragment{
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private TextView dataAtual;
    private Calendar calendar;
    private RecyclerView recyclerPdvs;
    List<PDV> lista_pdvs = new ArrayList<PDV>();


    public ListaPdvsDia() {}

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListaPdvsDia.
     */
    public static ListaPdvsDia newInstance() {
        ListaPdvsDia fragment = new ListaPdvsDia();
        //Bundle args = new Bundle();
        //fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Log.d("create view","passou pela lista pdvs");
        View view = inflater.inflate(R.layout.fragment_lista_pdvs_dia, container, false);


        //pegando data atual
        calendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yy/MM/dd");
        String dataFormatada = df.format(calendar.getTime());

        //lista dos pdvs
        recyclerPdvs = (RecyclerView) view.findViewById(R.id.rvListaPdvs);
        preencheListaPdvs(5);
        recyclerPdvs.setAdapter(new PDVRecyclerAdapter(lista_pdvs,getContext()));
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerPdvs.setLayoutManager(lm);


        //Botao voltar data
        Button voltarData = (Button) view.findViewById(R.id.btDataAnterior);
        voltarData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //Botao proxima data
        Button proximaData = (Button) view.findViewById(R.id.btDataProxima);
        proximaData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        //Setando data atual
        dataAtual = (TextView) view.findViewById(R.id.tvDataListaPdvs);
        dataAtual.setText(dataFormatada);




        return view;
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }
    public void preencheListaPdvs(int quant){
        String nome = "nome";
        int cod_canal = 0;
        String bandeira = "bandeira";
        int cnpj = 0;
        int telefone = 0;
        String endereco = "endereco";
        String bairro = "bairro";
        String cidade = "cidade";
        String estado = "estado";
        String id = "id";
        for(int i=0;i<quant;i++){
            PDV pdv = new PDV(nome+i,cod_canal+i,bandeira+i,cnpj+i,telefone+i,endereco+i,bairro+i,cidade+i,estado+i,id+i);
            lista_pdvs.add(pdv);
        }

    }
}
