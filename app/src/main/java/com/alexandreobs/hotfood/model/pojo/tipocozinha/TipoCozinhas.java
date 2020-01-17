
package com.alexandreobs.hotfood.model.pojo.tipocozinha;

import com.google.gson.annotations.Expose;

import java.util.List;


@SuppressWarnings("unused")
public class TipoCozinhas {

    @Expose
    private List<Cuisine> cuisines;

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

}
