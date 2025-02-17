package lab_07.task01.vehiclecalculator;

public class CarCalculator implements VehicleCalculator {

    public static int averageCarPrice = 6000;
    private Vehicle vehicle;


    public CarCalculator() {
    }

    public int getRetailPrice() {
        assert vehicle != null;

        return switch (vehicle.getModel()) {
            case "Ford" -> 3000;
            case "Audi" -> 5000;
            case "BMW" -> 7000;
            case "Tesla" -> 10000;
            default -> averageCarPrice;
        };
    }

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String calculatePrice() {
        assert vehicle != null;
        int price = (int) (vehicle.getDamage() * Math.max(getRetailPrice() - (vehicle.getAge() * 100), 0));
        return price + "USD";
    }

}
