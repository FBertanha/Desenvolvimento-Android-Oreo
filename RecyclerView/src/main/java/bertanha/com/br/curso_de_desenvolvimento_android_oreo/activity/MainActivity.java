package bertanha.com.br.curso_de_desenvolvimento_android_oreo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bertanha.com.br.curso_de_desenvolvimento_android_oreo.R;
import bertanha.com.br.curso_de_desenvolvimento_android_oreo.adapter.Adapter;
import bertanha.com.br.curso_de_desenvolvimento_android_oreo.adapter.RecyclerItemClickListener;
import bertanha.com.br.curso_de_desenvolvimento_android_oreo.model.Filme;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        criarFilmes();
        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimização
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Toast.makeText(getApplicationContext(),
                                        "Item Pressionado " + listaFilmes.get(position).getTitulo(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(getApplicationContext(),
                                        "Item Pressionado Long " +  listaFilmes.get(position).getTitulo(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                ));

    }

    private void criarFilmes() {
        listaFilmes.add(new Filme("titulo", "genero", "2011"));
        listaFilmes.add(new Filme("titulo1", "genero1", "2012"));
        listaFilmes.add(new Filme("titulo2", "genero2", "2013"));
        listaFilmes.add(new Filme("titulo3", "genero3", "2014"));
        listaFilmes.add(new Filme("titulo4", "genero4", "2015"));
        listaFilmes.add(new Filme("titulo5", "genero5", "2016"));
        listaFilmes.add(new Filme("titulo6", "genero6", "2017"));
    }
}
