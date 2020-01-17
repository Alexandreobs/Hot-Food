package com.alexandreobs.hotfood.model.data.remote;

import com.alexandreobs.hotfood.model.pojo.categorias.Categorias;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EndPoints {

    @GET("/categories")
    Observable<Categorias> GetCategoriaEndPoint(
            @Query("header") String chaveApi


    );
}
