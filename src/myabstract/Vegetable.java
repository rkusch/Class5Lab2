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
public class Vegetable extends Food {

    private String vegetableCategory;
    private String colorOfVegetable;

    public String getVegetableCategory() {
        return vegetableCategory;
    }

    public void setVegetableCategory(String vegetableCategory) {
        this.vegetableCategory = vegetableCategory;
    }

    public String getColorOfVegetable() {
        return colorOfVegetable;
    }

    public void setColorOfVegetable(String colorOfVegetable) {
        this.colorOfVegetable = colorOfVegetable;
    }

    //this output should be in a seperate class
    @Override
    public void displayNutrientBreakdownOfFood() {
        System.out.println("Food Category: " + getFoodCategory());
        System.out.println("Vegetable Category: " + getVegetableCategory());
        System.out.println("Calories: " + getCaloriesInObject());
    }

}
