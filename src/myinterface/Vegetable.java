/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author rkusch
 */
public abstract class Vegetable implements Food {

    private double caloriesInObject;
    private String foodCategory;
    private String vegetableCategory;
    private String colorOfVegetable;

    @Override
    public double getCaloriesInObject() {
        return caloriesInObject;
    }

    @Override
    public void setCaloriesInObject(double caloriesInObject) {
        this.caloriesInObject = caloriesInObject;
    }

    @Override
    public String getFoodCategory() {
        return foodCategory;
    }

    @Override
    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    //this output should be in a seperate class
    @Override
    public void displayNutrientBreakdownOfFood() {
        System.out.println("Food Category: " + getFoodCategory());
        System.out.println("Vegetable Category: " + getVegetableCategory());
        System.out.println("Vegetable Color: " + getColorOfVegetable());
        System.out.println("Calories: " + getCaloriesInObject());
    }

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

}
