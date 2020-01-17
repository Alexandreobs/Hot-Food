package com.alexandreobs.hotfood.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexandreobs.hotfood.R;
import com.alexandreobs.hotfood.model.pojo.categorias.Categories;
import com.alexandreobs.hotfood.view.interfacedeclick.CategoriaOnClick;

import java.util.List;
import java.util.PriorityQueue;

public class CategoriaAdapter extends RecyclerView.Adapter <CategoriaAdapter.ViewHolder> {

    private List<Categories> categoriesList;
    private CategoriaOnClick listner;

    public CategoriaAdapter(List<Categories> categoriesList, CategoriaOnClick listner) {
        this.categoriesList = categoriesList;
        this.listner = listner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_categoria, parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Categories result = categoriesList.get(position);
        holder.onBind(result);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listner.OnClick(result);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public void autalizaLista(List<Categories> novaLista){
        if (this.categoriesList.isEmpty()){
            this.categoriesList = novaLista;
        } else {
            this.categoriesList.addAll(novaLista);
        }
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeCategoria;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeCategoria = itemView.findViewById(R.id.nome_categoria);
        }


        public void onBind(Categories reult) {

            nomeCategoria.setText(reult.getName());
        }
    }
}
