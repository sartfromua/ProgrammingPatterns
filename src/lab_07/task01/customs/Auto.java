package lab_07.task01.customs;

import lab_07.task01.vehiclecalculator.Vehicle;

public class Auto {

    final public int age;           // вік автомобіля в роках
    final public String model;      // марка автомобіля
    final public boolean damaged;   // чи пошкоджений автомобіль після ДТП
    final public int mileage;       // пробіг автомобіля в кілометрах

    public Auto(int age, String model, boolean damaged, int mileage) {
        this.age = age;
        this.model = model;
        this.damaged = damaged;
        this.mileage = mileage;
    }

    public Vehicle toVehicle() {
        float damage = damaged ? 1 : 0;
        return new Vehicle(age, model, damage, mileage);
    }
}