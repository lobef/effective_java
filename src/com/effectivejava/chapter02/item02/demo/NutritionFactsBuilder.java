package com.effectivejava.chapter02.item02.demo;

public class NutritionFactsBuilder {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int carbohydrate;
	private final int sodium;

	private NutritionFactsBuilder(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.carbohydrate = builder.carbohydrate;
		this.sodium = builder.sodium;
	}

	public static class Builder implements com.effectivejava.chapter02.item02.demo.Builder<NutritionFactsBuilder> {
		private final int servingSize;
		private final int servings;
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public NutritionFactsBuilder build() {
			return new NutritionFactsBuilder(this);
		}

	}

	public static void main(String[] args) {
		NutritionFactsBuilder nfb = new NutritionFactsBuilder.Builder(14, 13).calories(23).fat(34).build();
	}

}
