package br.com.etecia.halloween;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List <Cartazes> lstCartazes;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView modeloTitulo;

        ImageView modeloImagem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloImagem = itemView.findViewById(R.id.modeloimg);
            modeloTitulo = itemView.findViewById(R.id.idmodelotxt);
        }
    }
}
