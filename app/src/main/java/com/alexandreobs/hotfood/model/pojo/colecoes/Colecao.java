
package com.alexandreobs.hotfood.model.pojo.colecoes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class Colecao {

    @Expose
    private List<Collection> collections;
    @SerializedName("display_text")
    private String displayText;
    @SerializedName("has_more")
    private Long hasMore;
    @SerializedName("has_total")
    private Long hasTotal;
    @SerializedName("share_url")
    private String shareUrl;
    @SerializedName("user_has_addresses")
    private Boolean userHasAddresses;

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

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

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Boolean getUserHasAddresses() {
        return userHasAddresses;
    }

    public void setUserHasAddresses(Boolean userHasAddresses) {
        this.userHasAddresses = userHasAddresses;
    }

}
