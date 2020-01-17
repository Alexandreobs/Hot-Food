package com.alexandreobs.hotfood.model.repository;

import com.alexandreobs.hotfood.model.pojo.categorias.Categorias;

import io.reactivex.Observable;

import static com.alexandreobs.hotfood.model.data.remote.RetrofitService.getApiService;

public class CategoriaReposytory {

    Observable<Categorias> getCategorias (String chaveApi){
        return getApiService().GetCategoriaEndPoint(chaveApi);
    }

}
