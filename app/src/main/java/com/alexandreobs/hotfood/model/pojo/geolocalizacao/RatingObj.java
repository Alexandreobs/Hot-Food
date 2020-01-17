
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class RatingObj {

    @SerializedName("bg_color")
    private BgColor bgColor;
    @Expose
    private Title title;

    public BgColor getBgColor() {
        return bgColor;
    }

    public void setBgColor(BgColor bgColor) {
        this.bgColor = bgColor;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

}
