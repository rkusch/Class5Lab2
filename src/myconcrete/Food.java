/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author rkusch
 */
public class Food {

    private double caloriesInObject;
    private String foodCategory;

    public double getCaloriesInObject() {
        return caloriesInObject;
    }

    public void setCaloriesInObject(double caloriesInObject) {
        this.caloriesInObject = caloriesInObject;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void displayNutrientBreakdownOfFood() {
        System.out.println("Food Category: " + getFoodCategory());
        System.out.println("Calories: " + getCaloriesInObject());
    }

}
