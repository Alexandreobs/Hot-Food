
package com.alexandreobs.hotfood.model.pojo.estabelecimentos;

import com.google.gson.annotations.Expose;

import java.util.List;


@SuppressWarnings("unused")
public class Estabelecimento {

    @Expose
    private List<Establishment> establishments;

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }

}
