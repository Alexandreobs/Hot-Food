
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class R {

    @SerializedName("has_menu_status")
    private HasMenuStatus hasMenuStatus;
    @SerializedName("res_id")
    private Long resId;

    public HasMenuStatus getHasMenuStatus() {
        return hasMenuStatus;
    }

    public void setHasMenuStatus(HasMenuStatus hasMenuStatus) {
        this.hasMenuStatus = hasMenuStatus;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

}
