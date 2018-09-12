/**
 * Created by mgreen14 on 12/29/17.
 * @author Matt Green
 * @version 1.0
 */
public enum MealType {
    BREAKFAST("Breakfast"), DESSERT("Dessert"), DINNER("Dinner"), LUNCH("Lunch");

    private String meal;

    /**
     *
     * @param meal
     */
    MealType(String meal) {
        this.meal = meal;
    }

    /**
     *
     * @return meal type
     */
    public String getMeal() {
        return meal;
    }
}
