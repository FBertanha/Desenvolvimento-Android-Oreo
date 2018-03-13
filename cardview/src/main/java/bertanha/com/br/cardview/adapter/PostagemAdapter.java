package bertanha.com.br.cardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bertanha.com.br.cardview.R;
import bertanha.com.br.cardview.model.Postagem;

/**
 * Created by berta on 3/11/2018.
 */

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.PostagemViewHolder>{


    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @Override
    public PostagemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);
        return new PostagemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostagemViewHolder holder, int position) {
        Postagem postagem = postagens.get(position);

        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class PostagemViewHolder extends RecyclerView.ViewHolder{
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public PostagemViewHolder(View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
