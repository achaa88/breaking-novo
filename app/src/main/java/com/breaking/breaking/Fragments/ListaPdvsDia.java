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
import com.breaking.breaking.adapter.ExPdvRecyclerAdapter;
import com.breaking.breaking.adapter.ExPdvViewHolder;
import com.breaking.breaking.domain.ExecucaoPDV;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ListaPdvsDia extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private TextView dataAtual;
    private RecyclerView recyclerView;
    private Calendar calendar;
    private DatabaseReference refPrincipal;

    public ListaPdvsDia() {}

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListaPdvsDia.
     */
    public static ListaPdvsDia newInstance() {
        ListaPdvsDia fragment = new ListaPdvsDia();
        Bundle args = new Bundle();
        fragment.setArguments(args);
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
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
        String dataFormatada = df.format(calendar.getTime());

        //lista dos pdvs
        recyclerView = (RecyclerView) view.findViewById(R.id.rvListaPdvs);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: fazer o onclick dos items da lista de pdvs mandando para a execucao do pdv correspondente
            }
        });

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
                //TODO aumentar valor da data
                String data = "pegar prox data";
                alteraRefListaPdvs(data);

            }
        });

        //Setando data atual
        dataAtual = (TextView) view.findViewById(R.id.tvDataListaPdvs);
        dataAtual.setText(dataFormatada);

        refPrincipal = LibraryClass.getFirebase().child("execucaoDiaria").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
        alteraRefListaPdvs(dataFormatada);


        return view;
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }
    private void alteraRefListaPdvs(String data) {
        ExPdvRecyclerAdapter adapter = new ExPdvRecyclerAdapter(ExecucaoPDV.class,R.layout.layout_item_ex_pdv, ExPdvViewHolder.class,refPrincipal.child(data));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
