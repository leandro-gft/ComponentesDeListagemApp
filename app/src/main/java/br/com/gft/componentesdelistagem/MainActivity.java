package br.com.gft.componentesdelistagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listItens;
    private String[] itens = {
            "Campinas", "Sumaré", "São Paulo", "Cajamar", "Barueri", "Limeira", "Americana",
            "Valinhos", "Vinhedo", "Louveira", "Jundiaí", "Santana do Parnaíba", "Carapicuíba",
            "Osasco"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItens = findViewById(R.id.listItens);

        //Cria adaptador para a lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adiciona adaptador à lista
        listItens.setAdapter(adapter);

        //Adiciona clique na lista
        listItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Item selecionado: "+listItens.getItemAtPosition(position),
                        Toast.LENGTH_SHORT).
                        show();
            }
        });


    }

    public void nextRecyclerView(View view){
     //   startActivity(new Intent(this, RecyclerView.class));
    }
}
