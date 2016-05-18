package com.sunyanxiong.ssm.po;

/**
 * Description: 菜品类
 * <p>
 * Created by daxiongit on 2016/5/18 0018.
 */
public class Meal {

    private int id;
    private int mealseriesid;
    private String mealname;
    private String mealsummarize;
    private String mealdescription;
    private double mealprice;
    private String mealimage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMealseriesid() {
        return mealseriesid;
    }

    public void setMealseriesid(int mealseriesid) {
        this.mealseriesid = mealseriesid;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealsummarize() {
        return mealsummarize;
    }

    public void setMealsummarize(String mealsummarize) {
        this.mealsummarize = mealsummarize;
    }

    public String getMealdescription() {
        return mealdescription;
    }

    public void setMealdescription(String mealdescription) {
        this.mealdescription = mealdescription;
    }

    public double getMealprice() {
        return mealprice;
    }

    public void setMealprice(double mealprice) {
        this.mealprice = mealprice;
    }

    public String getMealimage() {
        return mealimage;
    }

    public void setMealimage(String mealimage) {
        this.mealimage = mealimage;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", mealseriesid=" + mealseriesid +
                ", mealname='" + mealname + '\'' +
                ", mealsummarize='" + mealsummarize + '\'' +
                ", mealdescription='" + mealdescription + '\'' +
                ", mealprice=" + mealprice +
                ", mealimage='" + mealimage + '\'' +
                '}';
    }
}
