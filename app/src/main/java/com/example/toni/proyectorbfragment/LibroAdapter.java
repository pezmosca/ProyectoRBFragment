package com.example.toni.proyectorbfragment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Toni on 01/05/2016.
 */
public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {
    private List<Libro> libros;
    private static RecyclerViewClickListener mListener;

    public LibroAdapter(List<Libro> libros, RecyclerViewClickListener mListener) {
        this.libros = libros;
        this.mListener = mListener;
    }

    public interface RecyclerViewClickListener {
        public void recyclerViewListClicked(View v, int position);
    }

    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        return new LibroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) {
        holder.bind(libros.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }


    public static class LibroViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView portada;
        public TextView titulo;
        public TextView autor;
        CardView cv;

        public LibroViewHolder(View itemView) {
            super(itemView);

            portada = (ImageView) itemView.findViewById(R.id.imagen);
            titulo = (TextView) itemView.findViewById(R.id.nombre);
            autor = (TextView) itemView.findViewById(R.id.autor);;

            
        }

        public void bind(final Libro libro, final RecyclerViewClickListener listener) {
            portada.setImageResource(libro.getPortada());
            titulo.setText(libro.getTitulo());
            autor.setText(libro.getAutor());
        }

        @Override
        public void onClick(View v) {
            mListener.recyclerViewListClicked(v, getLayoutPosition());
        }
    }

}
