
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Title {

    @Expose
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
