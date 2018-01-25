package com.pojo;

import java.util.List;

public class MealCombiner{

    private Food staples;

    private Food soups;

    private List<Food> dishes;

    public Food getStaples() {
        return staples;
    }

    public void setStaples(Food staples) {
        this.staples = staples;
    }

    public Food getSoups() {
        return soups;
    }

    public void setSoups(Food soups) {
        this.soups = soups;
    }

    public List<Food> getDishes() {
        return dishes;
    }

    public void setDishes(List<Food> dishes) {
        this.dishes = dishes;
    }
}
