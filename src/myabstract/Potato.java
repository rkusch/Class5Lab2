/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author rkusch
 */
public class Potato extends Vegetable {

    private String potatoCategory;

    public String getPotatoCategory() {
        return potatoCategory;
    }

    public void setPotatoCategory(String potatoCategory) {
        this.potatoCategory = potatoCategory;
    }

    //this output should be in a seperate class
    @Override
    public void displayNutrientBreakdownOfFood() {
        System.out.println("Food Category: " + getFoodCategory());
        System.out.println("Vegetable Category: " + getVegetableCategory());
        System.out.println("Potato Category: " + getPotatoCategory());
        System.out.println("Calories: " + getCaloriesInObject());
    }
}
