package br.com.gft.componentesdelistagem.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import br.com.gft.componentesdelistagem.R;

public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View postLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_postagem, parent, false);
        return new MyViewHolder(postLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.usuario.setText("Leandro Pompilio Sacchi");
        holder.momento.setText("Agora mesmo");
        holder.post.setText("#TBT viagem massa");
        holder.img.setImageResource(R.drawable.imagem1);
    }

    @Override
    public int getItemCount() {
        return 5;
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
