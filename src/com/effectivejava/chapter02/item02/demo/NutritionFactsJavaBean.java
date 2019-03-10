package com.effectivejava.chapter02.item02.demo;

public class NutritionFactsJavaBean {

	private int servingSize = -1;// (mL) required;
	private int servings = -1;// (per container) required;
	private int calories;// optional
	private int fat;// (g) optional
	private int sodium;// (mg) optional
	private int carbohydrate;// (g) optional

	public NutritionFactsJavaBean() {

	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

}
