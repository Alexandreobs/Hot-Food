
package com.alexandreobs.hotfood.model.pojo.detalheslocal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Photo {

    @Expose
    private String caption;
    @SerializedName("comments_count")
    private String commentsCount;
    @SerializedName("friendly_time")
    private String friendlyTime;
    @Expose
    private String height;
    @Expose
    private String id;
    @SerializedName("likes_count")
    private String likesCount;
    @SerializedName("res_id")
    private String resId;
    @SerializedName("thumb_url")
    private String thumbUrl;
    @Expose
    private String timestamp;
    @Expose
    private String url;
    @Expose
    private User user;
    @Expose
    private String width;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getFriendlyTime() {
        return friendlyTime;
    }

    public void setFriendlyTime(String friendlyTime) {
        this.friendlyTime = friendlyTime;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

}
