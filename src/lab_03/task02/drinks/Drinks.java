package lab_03.task02.drinks;

import java.util.List;

public interface Drinks {
     void prepare();
     int getProdCost();
     int getFullPrice();
     List<String> getIngredients();
}
