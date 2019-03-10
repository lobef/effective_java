package com.effectivejava.chapter02.item02.demo;

@SuppressWarnings("unused")
public class NutritionFacts {

	private final int servingSize;// (mL) required;
	private final int servings;// (per container) required;
	private final int calories;// optional
	private final int fat;// (g) optional
	private final int sodium;// (mg) optional
	private final int carbohydrate;// (g) optional

	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 100, 0, 35, 27);
		// 创建NutritionFacts对象，通常传递本不需要的对象，如本例中不需要fat，但是传递了0。随着参数值的增加，重叠构造器模式失去控制，不易读
	}

}
