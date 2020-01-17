
package com.alexandreobs.hotfood.model.pojo.detalheslocal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class Popularity {

    @SerializedName("nightlife_index")
    private String nightlifeIndex;
    @Expose
    private String popularity;
    @SerializedName("top_cuisines")
    private List<String> topCuisines;

    public String getNightlifeIndex() {
        return nightlifeIndex;
    }

    public void setNightlifeIndex(String nightlifeIndex) {
        this.nightlifeIndex = nightlifeIndex;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public List<String> getTopCuisines() {
        return topCuisines;
    }

    public void setTopCuisines(List<String> topCuisines) {
        this.topCuisines = topCuisines;
    }

}
