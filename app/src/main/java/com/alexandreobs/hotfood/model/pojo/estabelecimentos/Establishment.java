
package com.alexandreobs.hotfood.model.pojo.estabelecimentos;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Establishment {

    @Expose
    private Establishment establishment;
    @Expose
    private Long id;
    @Expose
    private String name;

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
