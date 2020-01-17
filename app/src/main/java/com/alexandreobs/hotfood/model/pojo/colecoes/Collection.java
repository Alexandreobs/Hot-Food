
package com.alexandreobs.hotfood.model.pojo.colecoes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Collection {

    @Expose
    private Collection collection;
    @SerializedName("collection_id")
    private Long collectionId;
    @Expose
    private String description;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("res_count")
    private Long resCount;
    @SerializedName("share_url")
    private String shareUrl;
    @Expose
    private String title;
    @Expose
    private String url;

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getResCount() {
        return resCount;
    }

    public void setResCount(Long resCount) {
        this.resCount = resCount;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
