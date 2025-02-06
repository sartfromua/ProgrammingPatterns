package lab_02.task01.drinks;

import java.util.List;

public interface Drinks {
     void prepare();
     int getProdCost();
     int getFullPrice();
     List<String> getIngredients();
}
