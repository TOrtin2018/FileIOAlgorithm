/**
 * Created by mgreen14 on 12/29/17.
 * @author Matt Green
 * @version 1.0
 */
public class Meals {
    private MealType mealType;
    private String item;
    private int calories;

    /**
     * constructor
     *
     * @param mealType instance of mealTYpe object
     * @param item food item
     * @param calories number of calories
     */
    public Meals(MealType mealType, String item, int calories) {
        this.mealType = mealType;
        this.item = item;
        this.calories = calories;
    }

    /**
     *
     * @return mealtype
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     *
     * @return food item
     */
    public String getItem() {
        return item;
    }

    /**
     *
     * @return number of calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     *
     * @param o
     * @return boolean true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meals meals = (Meals) o;

        if (getCalories() != meals.getCalories()) return false;
        if (getMealType() != meals.getMealType()) return false;
        return getItem().equals(meals.getItem());
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = getMealType().hashCode();
        result = 31 * result + getItem().hashCode();
        result = 31 * result + getCalories();
        return result;
    }

    /**
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Meals{" +
                "mealType=" + mealType +
                ", item='" + item + '\'' +
                ", calories=" + calories +
                '}';
    }

}
