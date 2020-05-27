package br.com.gft.componentesdelistagem.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.gft.componentesdelistagem.R;
import br.com.gft.componentesdelistagem.activity.adapter.AdapterPostagem;

public class CardView extends AppCompatActivity {

    private RecyclerView recyclerViewCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        recyclerViewCardView = findViewById(R.id.recyclerViewCardView);

        //Define layout
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerViewCardView.setLayoutManager(layoutManager);

        //Define adapter
        AdapterPostagem adapter = new AdapterPostagem();
        recyclerViewCardView.setAdapter(adapter);
    }
}
