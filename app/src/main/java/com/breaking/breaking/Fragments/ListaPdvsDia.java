package com.breaking.breaking.Fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.breaking.breaking.R;
import com.breaking.breaking.adapter.PDVRecyclerAdapter;
import com.breaking.breaking.adapter.PDVViewHolder;
import com.breaking.breaking.adapter.UserRecyclerAdapter;
import com.breaking.breaking.adapter.UserViewHolder;
import com.breaking.breaking.domain.PDV;
import com.breaking.breaking.domain.User;
import com.breaking.breaking.domain.util.LibraryClass;
import com.google.firebase.database.DatabaseReference;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaPdvsDia.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaPdvsDia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaPdvsDia extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private OnFragmentInteractionListener mListener;

    public ListaPdvsDia() {
        // Required empty public constructor
    }

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
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvListaPdvs);
        DatabaseReference pdvref = LibraryClass.getFirebase().child("pdvs");
        PDVRecyclerAdapter adapter = new PDVRecyclerAdapter(PDV.class, android.R.layout.two_line_list_item,PDVViewHolder.class,pdvref );
        //UserRecyclerAdapter adapter = new UserRecyclerAdapter(User.class,android.R.layout.two_line_list_item, UserViewHolder.class,firebase);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
    /*
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    /*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    */
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
