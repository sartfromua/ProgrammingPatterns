package lab_07.task01;

import lab_07.task01.customs.Auto;
import lab_07.task01.customs.UkraineCustoms;
import lab_07.task01.vehiclecalculator.Car;
import lab_07.task01.vehiclecalculator.Truck;
import lab_07.task01.vehiclecalculator.Vehicle;

public class Main {
    public static UkraineCustoms customs = new UkraineCustoms();

    public static void main(String[] args) {
        Auto car = new Auto(5, "Ford", true, 1000);
        Auto truck = new Auto(5, "Audi", false, 0);
        float totalPrice = 0;
        totalPrice += customs.vehiclePrice(car) + customs.tax(car);
        totalPrice += customs.vehiclePrice(truck) + customs.tax(truck);
        System.out.println(totalPrice);

    }
}
