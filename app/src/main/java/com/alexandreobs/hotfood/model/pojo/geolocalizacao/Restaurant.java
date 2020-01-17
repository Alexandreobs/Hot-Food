
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Restaurant {

    @Expose
    private String apikey;
    @SerializedName("average_cost_for_two")
    private Long averageCostForTwo;
    @SerializedName("book_again_url")
    private String bookAgainUrl;
    @SerializedName("book_form_web_view_url")
    private String bookFormWebViewUrl;
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
    private Long hasOnlineDelivery;
    @SerializedName("has_table_booking")
    private Long hasTableBooking;
    @Expose
    private String id;
    @SerializedName("include_bogo_offers")
    private Boolean includeBogoOffers;
    @SerializedName("is_book_form_web_view")
    private Long isBookFormWebView;
    @SerializedName("is_delivering_now")
    private Long isDeliveringNow;
    @SerializedName("is_table_reservation_supported")
    private Long isTableReservationSupported;
    @SerializedName("is_zomato_book_res")
    private Long isZomatoBookRes;
    @Expose
    private Location location;
    @SerializedName("menu_url")
    private String menuUrl;
    @SerializedName("mezzo_provider")
    private String mezzoProvider;
    @Expose
    private String name;
    @Expose
    private List<Object> offers;
    @SerializedName("opentable_support")
    private Long opentableSupport;
    @SerializedName("photos_url")
    private String photosUrl;
    @SerializedName("price_range")
    private Long priceRange;
    @SerializedName("R")
    private R r;
    @SerializedName("switch_to_order_menu")
    private Long switchToOrderMenu;
    @Expose
    private String thumb;
    @Expose
    private String url;
    @SerializedName("user_rating")
    private UserRating userRating;

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public Long getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(Long averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
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

    public Long getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(Long hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public Long getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(Long hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIncludeBogoOffers() {
        return includeBogoOffers;
    }

    public void setIncludeBogoOffers(Boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    public Long getIsBookFormWebView() {
        return isBookFormWebView;
    }

    public void setIsBookFormWebView(Long isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    public Long getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(Long isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public Long getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    public void setIsTableReservationSupported(Long isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    public Long getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    public void setIsZomatoBookRes(Long isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
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

    public String getMezzoProvider() {
        return mezzoProvider;
    }

    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public Long getOpentableSupport() {
        return opentableSupport;
    }

    public void setOpentableSupport(Long opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public Long getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Long priceRange) {
        this.priceRange = priceRange;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public Long getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    public void setSwitchToOrderMenu(Long switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
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
