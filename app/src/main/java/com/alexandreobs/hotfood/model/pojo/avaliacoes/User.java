
package com.alexandreobs.hotfood.model.pojo.avaliacoes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class User {

    @SerializedName("foodie_color")
    private String foodieColor;
    @SerializedName("foodie_level")
    private String foodieLevel;
    @SerializedName("foodie_level_num")
    private String foodieLevelNum;
    @Expose
    private String name;
    @SerializedName("profile_deeplink")
    private String profileDeeplink;
    @SerializedName("profile_image")
    private String profileImage;
    @SerializedName("profile_url")
    private String profileUrl;
    @SerializedName("zomato_handle")
    private String zomatoHandle;

    public String getFoodieColor() {
        return foodieColor;
    }

    public void setFoodieColor(String foodieColor) {
        this.foodieColor = foodieColor;
    }

    public String getFoodieLevel() {
        return foodieLevel;
    }

    public void setFoodieLevel(String foodieLevel) {
        this.foodieLevel = foodieLevel;
    }

    public String getFoodieLevelNum() {
        return foodieLevelNum;
    }

    public void setFoodieLevelNum(String foodieLevelNum) {
        this.foodieLevelNum = foodieLevelNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileDeeplink() {
        return profileDeeplink;
    }

    public void setProfileDeeplink(String profileDeeplink) {
        this.profileDeeplink = profileDeeplink;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getZomatoHandle() {
        return zomatoHandle;
    }

    public void setZomatoHandle(String zomatoHandle) {
        this.zomatoHandle = zomatoHandle;
    }

}
