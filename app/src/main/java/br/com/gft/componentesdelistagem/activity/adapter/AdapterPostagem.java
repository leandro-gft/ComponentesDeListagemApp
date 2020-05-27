package br.com.gft.componentesdelistagem.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.componentesdelistagem.R;
import br.com.gft.componentesdelistagem.activity.model.Postagem;


public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder> {

    private List<Postagem> postagens;

    public AdapterPostagem(List<Postagem> posts) {
        this.postagens = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View postLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_postagem, parent, false);
        return new MyViewHolder(postLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem post = postagens.get(position);
        holder.usuario.setText(post.getNomeUsuario());
        holder.momento.setText(post.getMomento());
        holder.post.setText(post.getPostagem());
        holder.img.setImageResource(post.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView usuario;
        TextView momento;
        ImageView img;
        TextView post;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            usuario = itemView.findViewById(R.id.textUsuario);
            momento = itemView.findViewById(R.id.textMomento);
            post = itemView.findViewById(R.id.textPost);
            img = itemView.findViewById(R.id.imgPost);

        }
    }

}
