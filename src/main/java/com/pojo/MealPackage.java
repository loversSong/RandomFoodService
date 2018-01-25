package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class MealPackage extends Food{

    private List<String> vegetables;
    private List<String> meats;

    public List<String> getVegetables() {
        return vegetables;
    }

    public void addVegetable(String vegetable) {
        if (vegetables == null) {
            vegetables = new ArrayList<>();
            vegetables.add(vegetable);
        } else {
            vegetables.addAll(vegetables);
        }
    }
    public void addVegetables(List<String> vegetables) {
        if (this.vegetables == null) {
            this.vegetables = vegetables;
        } else {
            this.vegetables.addAll(vegetables);
        }
    }

    public List<String> getMeats() {
        return meats;
    }

    public void addMeats(List<String> meats) {
        if (this.meats == null) {
            this.meats = meats;
        } else {
            this.meats.addAll(meats);
        }
    }
}
