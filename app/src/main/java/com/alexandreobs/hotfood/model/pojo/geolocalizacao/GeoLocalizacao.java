
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class GeoLocalizacao {

    @Expose
    private String link;
    @Expose
    private Location location;
    @SerializedName("nearby_restaurants")
    private List<NearbyRestaurant> nearbyRestaurants;
    @Expose
    private Popularity popularity;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<NearbyRestaurant> getNearbyRestaurants() {
        return nearbyRestaurants;
    }

    public void setNearbyRestaurants(List<NearbyRestaurant> nearbyRestaurants) {
        this.nearbyRestaurants = nearbyRestaurants;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

}
