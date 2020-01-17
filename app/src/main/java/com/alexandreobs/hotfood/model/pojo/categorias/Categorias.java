
package com.alexandreobs.hotfood.model.pojo.categorias;

import com.google.gson.annotations.Expose;

import java.util.List;


@SuppressWarnings("unused")
public class Categorias {

    @Expose
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
