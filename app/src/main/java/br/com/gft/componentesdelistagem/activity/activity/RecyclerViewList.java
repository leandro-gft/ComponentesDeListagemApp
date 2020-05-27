package br.com.gft.componentesdelistagem.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.gft.componentesdelistagem.R;
import br.com.gft.componentesdelistagem.activity.adapter.AdapterFilmes;
import br.com.gft.componentesdelistagem.activity.model.Filme;

public class RecyclerViewList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_list);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Filmes
        this.criarFilmes();

        //Configurar Adapter
        AdapterFilmes adapter = new AdapterFilmes(filmes);

        //Configurar RecyclerView

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
    }


    public void criarFilmes(){
        Filme f1 = new Filme("Parasita", "2019", "Drama");
        Filme f2 = new Filme("1917", "2019", "Drama");
        Filme f3 = new Filme("Ford vs Ferrari", "2019", "Drama");
        Filme f4 = new Filme("Coringa", "2019", "Drama");
        Filme f5 = new Filme("Era Uma Vez em Hollywood", "2019", "Drama");
        Filme f6 = new Filme("O Irlandês", "2019", "Drama");
        Filme f7 = new Filme("Adoráveis Mulheres", "2019", "Drama");
        Filme f8 = new Filme("Jojo Rabbit", "2019", "Drama");
        Filme f9 = new Filme("História de um Casamento", "2019", "Drama");
        Filme f10 = new Filme("Dor e Glória", "2019", "Drama");
        Filme f11 = new Filme("Dois Papas", "2019", "Drama");
        Filme f12 = new Filme("Harriet", "2019", "Drama");
        Filme f13 = new Filme("Toy Story 4", "2019", "Animação");
        Filme f14 = new Filme("Klaus", "2019", "Animação");
        Filme f15 = new Filme("Os Vingadores: O Ultimato", "2019", "Aventura");

        filmes.addAll(Arrays.asList(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15));

    }
}
