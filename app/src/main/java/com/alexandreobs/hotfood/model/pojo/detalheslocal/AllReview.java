
package com.alexandreobs.hotfood.model.pojo.detalheslocal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class AllReview {

    @SerializedName("comments_count")
    private String commentsCount;
    @Expose
    private String id;
    @Expose
    private String likes;
    @Expose
    private String rating;
    @SerializedName("rating_color")
    private String ratingColor;
    @SerializedName("rating_text")
    private String ratingText;
    @SerializedName("review_text")
    private String reviewText;
    @SerializedName("review_time_friendly")
    private String reviewTimeFriendly;
    @Expose
    private String timestamp;
    @Expose
    private User user;

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getReviewTimeFriendly() {
        return reviewTimeFriendly;
    }

    public void setReviewTimeFriendly(String reviewTimeFriendly) {
        this.reviewTimeFriendly = reviewTimeFriendly;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
