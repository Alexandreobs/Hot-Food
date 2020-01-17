
package com.alexandreobs.hotfood.model.pojo.menudiario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class DailyMenu {

    @SerializedName("daily_menu_id")
    private String dailyMenuId;
    @Expose
    private List<Dish> dishes;
    @SerializedName("end_date")
    private String endDate;
    @Expose
    private String name;
    @SerializedName("start_date")
    private String startDate;

    public String getDailyMenuId() {
        return dailyMenuId;
    }

    public void setDailyMenuId(String dailyMenuId) {
        this.dailyMenuId = dailyMenuId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
