package com.example.prueba_seleccion_radmas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorNumeros extends RecyclerView.Adapter<AdaptadorNumeros.NumerosViewHolder> {

    private ArrayList<Numero> datos;

    public AdaptadorNumeros(ArrayList<Numero> datos) {
        this.datos = datos;
    }

    public static class NumerosViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNumero;
        public NumerosViewHolder (View itemView){
            super (itemView);
            this.txtNumero =itemView.findViewById(R.id.numeros);
        }

        public void bindTitular (Numero numero)
        {
            txtNumero.setText(numero.getNumero());
        }
    }

    //Construye la vista
    @Override
    public NumerosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewTpe)
    {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        NumerosViewHolder tvh =new NumerosViewHolder(itemView);
        return tvh;
    }

    //Asigna cada componente
    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {
        Numero numero = datos.get(position);
        holder.bindTitular(numero);
    }

    //Devuelve el tamaño del array
    @Override
    public int getItemCount() {
        return datos.size();
    }
}
