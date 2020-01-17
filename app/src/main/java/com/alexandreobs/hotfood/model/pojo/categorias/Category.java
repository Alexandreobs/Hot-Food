
package com.alexandreobs.hotfood.model.pojo.categorias;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Category {

    @Expose
    private Categories categories;

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

}
