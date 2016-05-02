package com.example.toni.proyectorbfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toni on 30/04/2016.
 */
public class FragmentLista extends Fragment implements LibroAdapter.RecyclerViewClickListener {

    private RecyclerView recyclerView;
    private LibroAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List items;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_lista, container, false);

        items = new ArrayList();
        items.add(new Libro("Epístolas morales", "Séneca","25/05", "hola", "hola", "hola", R.drawable.user));

        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        recyclerView.setOnClickListener(new O);


        return rootView;
    }

    @Override
    public void recyclerViewListClicked(View v, int position) {
        items.get(position);
    }



}
