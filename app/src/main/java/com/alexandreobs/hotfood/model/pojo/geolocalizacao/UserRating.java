
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class UserRating {

    @SerializedName("aggregate_rating")
    private String aggregateRating;
    @SerializedName("rating_color")
    private String ratingColor;
    @SerializedName("rating_obj")
    private RatingObj ratingObj;
    @SerializedName("rating_text")
    private String ratingText;
    @Expose
    private String votes;

    public String getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public RatingObj getRatingObj() {
        return ratingObj;
    }

    public void setRatingObj(RatingObj ratingObj) {
        this.ratingObj = ratingObj;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

}
