
package com.alexandreobs.hotfood.model.pojo.detalheslocal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class DetalhesDoLocal {

    @SerializedName("best_rated_restaurants")
    private List<BestRatedRestaurant> bestRatedRestaurants;
    @Expose
    private Location location;
    @Expose
    private Popularity popularity;

    public List<BestRatedRestaurant> getBestRatedRestaurants() {
        return bestRatedRestaurants;
    }

    public void setBestRatedRestaurants(List<BestRatedRestaurant> bestRatedRestaurants) {
        this.bestRatedRestaurants = bestRatedRestaurants;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

}
