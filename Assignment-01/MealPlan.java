interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getMealType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto"; }
}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
}

class MealPlanner {
    static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated plan: " + plan.getMealType());
    }
}