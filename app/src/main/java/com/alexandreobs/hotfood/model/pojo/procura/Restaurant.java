
package com.alexandreobs.hotfood.model.pojo.procura;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Restaurant {

    @SerializedName("all_reviews")
    private List<AllReview> allReviews;
    @SerializedName("all_reviews_count")
    private String allReviewsCount;
    @SerializedName("average_cost_for_two")
    private String averageCostForTwo;
    @Expose
    private String cuisines;
    @Expose
    private String currency;
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("featured_image")
    private String featuredImage;
    @SerializedName("has_online_delivery")
    private String hasOnlineDelivery;
    @SerializedName("has_table_booking")
    private String hasTableBooking;
    @Expose
    private String id;
    @SerializedName("is_delivering_now")
    private String isDeliveringNow;
    @Expose
    private Location location;
    @SerializedName("menu_url")
    private String menuUrl;
    @Expose
    private String name;
    @SerializedName("phone_numbers")
    private String phoneNumbers;
    @SerializedName("photo_count")
    private String photoCount;
    @Expose
    private List<Photo> photos;
    @SerializedName("photos_url")
    private String photosUrl;
    @SerializedName("price_range")
    private String priceRange;
    @Expose
    private String thumb;
    @Expose
    private String url;
    @SerializedName("user_rating")
    private UserRating userRating;

    public List<AllReview> getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(List<AllReview> allReviews) {
        this.allReviews = allReviews;
    }

    public String getAllReviewsCount() {
        return allReviewsCount;
    }

    public void setAllReviewsCount(String allReviewsCount) {
        this.allReviewsCount = allReviewsCount;
    }

    public String getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(String averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(String hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public String getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(String hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(String isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(String photoCount) {
        this.photoCount = photoCount;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UserRating getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

}
