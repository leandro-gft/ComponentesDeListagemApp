package br.com.gft.componentesdelistagem.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.gft.componentesdelistagem.R;
import br.com.gft.componentesdelistagem.activity.model.Filme;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.MyViewHolder> {

    private List<Filme> listaFilmes;

    public AdapterFilmes(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Converter xml em objeto view
        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.ano.setText(filme.getAnoFilme());
        holder.genero.setText(filme.getGeneroFilme());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);

        }
    }

}