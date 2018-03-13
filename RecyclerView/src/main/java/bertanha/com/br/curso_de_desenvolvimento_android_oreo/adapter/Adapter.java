package bertanha.com.br.curso_de_desenvolvimento_android_oreo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bertanha.com.br.curso_de_desenvolvimento_android_oreo.R;
import bertanha.com.br.curso_de_desenvolvimento_android_oreo.model.Filme;


/**
 * Created by berta on 3/11/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    /**
     * ViewHolder
     */
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titlo;
        TextView ano;
        TextView genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            titlo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Filme filme = (Filme) listaFilmes.get(position);

        holder.titlo.setText(filme.getTitulo());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
