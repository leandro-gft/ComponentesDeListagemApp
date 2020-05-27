package br.com.gft.componentesdelistagem.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.gft.componentesdelistagem.R;
import br.com.gft.componentesdelistagem.activity.adapter.AdapterPostagem;
import br.com.gft.componentesdelistagem.activity.model.Postagem;

public class CardView extends AppCompatActivity {

    private RecyclerView recyclerViewCardView;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        recyclerViewCardView = findViewById(R.id.recyclerViewCardView);

        //Define layout
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerViewCardView.setLayoutManager(layoutManager);

        //Define adapter
        this.criaPostagens();
        AdapterPostagem adapter = new AdapterPostagem(postagens);
        recyclerViewCardView.setAdapter(adapter);

        //Cria postagens

    }

    public void criaPostagens(){

        Postagem p1 = new Postagem("Leandro Sacchi", "#TBT Viagem massa", "Agora mesmo", R.drawable.imagem1);
        Postagem p2 = new Postagem("Murillo Navarro", "Viaje, aproveite nossos descontos", "Agora mesmo", R.drawable.imagem2);
        Postagem p3 = new Postagem("Claudia Sacchi", "#Paris", "Agora mesmo", R.drawable.imagem3);
        Postagem p4 = new Postagem("Jéssika Sacchi", "Que foto linda!", "Agora mesmo", R.drawable.imagem4);

        postagens.addAll(Arrays.asList(p1, p2, p3, p4));
    }
}
