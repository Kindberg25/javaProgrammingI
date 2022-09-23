
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
          return;  
        }
        this.meals.add(meal);

    }

    public void printMeals() {
        for (String index : meals) {
            System.out.println(index);
        }
    }

    public void clearMenu() {
        meals.clear();
    }

    // implement the required methods here
}
