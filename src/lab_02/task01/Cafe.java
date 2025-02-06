package lab_02.task01;

import lab_02.task01.orders.*;

import java.util.List;

public class Cafe {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        List<DrinksOrder> menu = List.of(new AmericanoOrder(), new CappuccinoOrder(), new HotChocolateOrder(),
                new LatteOrder(), new EspressoOrder());

        int workHours = 8;
        int clientsPerHour = 15;

        int clients = workHours * clientsPerHour;

        for (int i = 0; i < clients; i++) {
            int n = (int) (Math.random() * menu.size());
            kitchen.prepareDrink(menu.get(n));
        }

        System.out.println("Cafe earned " + kitchen.countProfit() + " money");

    }
}
