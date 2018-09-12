/**
 * Created by mgreen14 on 12/29/17.
 * @author Matt Green
 * @version 1.0
 *
 * class creates array list of meals
 */
import java.util.ArrayList;


public class MealsArray {
    private ArrayList<Meals> meals = new ArrayList<>(100);
    private int i = 0;
    private int calories;


    /**
     *
     * @param arg1 meal type
     * @param arg2
     * @param arg3 calories
     */
    public void addElementWithStrings(String arg1, String arg2, String arg3) {
        MealType mealType;
        //if (i < meals.size() ) {

            switch (arg1) {
                case "Breakfast":
                    mealType = MealType.BREAKFAST;
                    break;
                case "Lunch":
                    mealType = MealType.LUNCH;
                    break;
                case "Dinner":
                    mealType = MealType.DINNER;
                    break;
                case "Dessert":
                    mealType = MealType.DESSERT;
                    break;
                default:
                    mealType = MealType.DINNER;
                    System.out.println("Invalid Meal Type " + arg1 + ", defaulted to Dinner.");
            }

            if (arg3.matches("-?\\d+(\\.\\d+)?")) {
                calories = Integer.parseInt(arg3);
            } else {
                calories = 100;
                System.out.println("Invalid Calories " + arg3 + ", defaulted to 100.");
            }
           meals.add(new Meals(mealType, arg2, calories));
        }
       /* else {
            System.out.println("Items exceeded system size.  File has " + i + ", while the system can only handle " + meals.size() + ".");
        }*/
    //}

    /**
     *
     * @return arrayList of meals
     */
    public ArrayList<Meals> getMeals() {
        return meals;
    }

    /**
     * method prints all meals
     */
    public void printAllMeals() {
        for (Meals item: meals) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    /**
     * method prints out list by meal type
     *
     * @param mealType instance of mealType object
     */


    public void printMealsByType(MealType mealType) {
        for (Meals item: meals) {
            if (item != null && item.getMealType() == mealType) {
                System.out.println(item);
            }

        }
    }

    /**
     * method searches meals array for items matching searched name.
     * @param s String name of meal
     */
    public void printByNameSearch(String s) {
        for (Meals item: meals) {
            if (item != null && item.getItem().indexOf(s) >= 0) {
                System.out.println(item);
            }

        }
    }

}
