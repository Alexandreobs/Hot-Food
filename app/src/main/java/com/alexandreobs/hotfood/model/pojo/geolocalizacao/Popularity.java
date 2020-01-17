
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Popularity {

    @Expose
    private String city;
    @SerializedName("nearby_res")
    private List<String> nearbyRes;
    @SerializedName("nightlife_index")
    private String nightlifeIndex;
    @SerializedName("nightlife_res")
    private String nightlifeRes;
    @Expose
    private String popularity;
    @SerializedName("popularity_res")
    private String popularityRes;
    @Expose
    private String subzone;
    @SerializedName("subzone_id")
    private Long subzoneId;
    @SerializedName("top_cuisines")
    private List<String> topCuisines;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getNearbyRes() {
        return nearbyRes;
    }

    public void setNearbyRes(List<String> nearbyRes) {
        this.nearbyRes = nearbyRes;
    }

    public String getNightlifeIndex() {
        return nightlifeIndex;
    }

    public void setNightlifeIndex(String nightlifeIndex) {
        this.nightlifeIndex = nightlifeIndex;
    }

    public String getNightlifeRes() {
        return nightlifeRes;
    }

    public void setNightlifeRes(String nightlifeRes) {
        this.nightlifeRes = nightlifeRes;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getPopularityRes() {
        return popularityRes;
    }

    public void setPopularityRes(String popularityRes) {
        this.popularityRes = popularityRes;
    }

    public String getSubzone() {
        return subzone;
    }

    public void setSubzone(String subzone) {
        this.subzone = subzone;
    }

    public Long getSubzoneId() {
        return subzoneId;
    }

    public void setSubzoneId(Long subzoneId) {
        this.subzoneId = subzoneId;
    }

    public List<String> getTopCuisines() {
        return topCuisines;
    }

    public void setTopCuisines(List<String> topCuisines) {
        this.topCuisines = topCuisines;
    }

}
