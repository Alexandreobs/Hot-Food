
package com.alexandreobs.hotfood.model.pojo.cidades;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Cidade {

    @SerializedName("has_more")
    private Long hasMore;
    @SerializedName("has_total")
    private Long hasTotal;
    @SerializedName("location_suggestions")
    private List<LocationSuggestion> locationSuggestions;
    @Expose
    private String status;
    @SerializedName("user_has_addresses")
    private Boolean userHasAddresses;

    public Long getHasMore() {
        return hasMore;
    }

    public void setHasMore(Long hasMore) {
        this.hasMore = hasMore;
    }

    public Long getHasTotal() {
        return hasTotal;
    }

    public void setHasTotal(Long hasTotal) {
        this.hasTotal = hasTotal;
    }

    public List<LocationSuggestion> getLocationSuggestions() {
        return locationSuggestions;
    }

    public void setLocationSuggestions(List<LocationSuggestion> locationSuggestions) {
        this.locationSuggestions = locationSuggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getUserHasAddresses() {
        return userHasAddresses;
    }

    public void setUserHasAddresses(Boolean userHasAddresses) {
        this.userHasAddresses = userHasAddresses;
    }

}
