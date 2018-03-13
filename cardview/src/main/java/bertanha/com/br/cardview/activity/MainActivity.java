package bertanha.com.br.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import bertanha.com.br.cardview.R;
import bertanha.com.br.cardview.adapter.PostagemAdapter;
import bertanha.com.br.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //((LinearLayoutManager) layoutManager).setOrientation(LinearLayout.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define PostagemAdapter
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    private void prepararPostagens() {
        postagens.add(new Postagem("Felipe Bertanha", "#viagem", R.drawable.imagem1));
        postagens.add(new Postagem("Felipe Bertanha", "#viagem2", R.drawable.imagem2));
        postagens.add(new Postagem("Felipe Bertanha", "#viagem3", R.drawable.imagem3));
        postagens.add(new Postagem("Felipe Bertanha", "#viagem4", R.drawable.imagem4));
    }


}
