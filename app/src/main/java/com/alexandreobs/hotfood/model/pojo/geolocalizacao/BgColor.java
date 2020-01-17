
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class BgColor {

    @Expose
    private String tint;
    @Expose
    private String type;

    public String getTint() {
        return tint;
    }

    public void setTint(String tint) {
        this.tint = tint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
