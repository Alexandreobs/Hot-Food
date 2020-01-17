
package com.alexandreobs.hotfood.model.pojo.menudiario;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class MenuDiario {

    @SerializedName("daily_menu")
    private List<DailyMenu> dailyMenu;

    public List<DailyMenu> getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(List<DailyMenu> dailyMenu) {
        this.dailyMenu = dailyMenu;
    }

}
