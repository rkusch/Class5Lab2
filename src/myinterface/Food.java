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
public interface Food {

    public abstract String getFoodCategory();

    public abstract void setFoodCategory(String foodCategory);

    public abstract double getCaloriesInObject();

    public abstract void setCaloriesInObject(double caloriesInObject);
    
    public abstract void displayNutrientBreakdownOfFood();

}
