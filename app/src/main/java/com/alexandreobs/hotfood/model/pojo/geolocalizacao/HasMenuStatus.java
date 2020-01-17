
package com.alexandreobs.hotfood.model.pojo.geolocalizacao;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class HasMenuStatus {

    @Expose
    private Long delivery;
    @Expose
    private Long takeaway;

    public Long getDelivery() {
        return delivery;
    }

    public void setDelivery(Long delivery) {
        this.delivery = delivery;
    }

    public Long getTakeaway() {
        return takeaway;
    }

    public void setTakeaway(Long takeaway) {
        this.takeaway = takeaway;
    }

}
