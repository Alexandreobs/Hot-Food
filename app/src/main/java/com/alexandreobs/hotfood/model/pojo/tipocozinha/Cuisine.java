
package com.alexandreobs.hotfood.model.pojo.tipocozinha;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Cuisine {

    @Expose
    private Cuisine cuisine;
    @SerializedName("cuisine_id")
    private Long cuisineId;
    @SerializedName("cuisine_name")
    private String cuisineName;

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Long getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(Long cuisineId) {
        this.cuisineId = cuisineId;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

}
