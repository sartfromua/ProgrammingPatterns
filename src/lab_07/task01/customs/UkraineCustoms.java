package lab_07.task01.customs;

import lab_07.task01.vehiclecalculator.CarCalculator;

public class UkraineCustoms implements Customs {

    private final CarCalculator calculator = new CarCalculator();
    private double exchangeRate = 41.0;

    public double getUSDtoUAHRate(double rate) { return this.exchangeRate; }

    public void setExchangeRate(double exchangeRate) { this.exchangeRate = exchangeRate; }


    @Override
    public float vehiclePrice(Auto auto) {
        calculator.setVehicle(auto.toVehicle());
        String priceUSD = calculator.calculatePrice();
        double priceUAH = Double.parseDouble(priceUSD.substring(0, priceUSD.length()-3)) * this.exchangeRate;
        return (float) priceUAH;
    }

    @Override
    public float tax(Auto auto) {
        float taxes = 0;
        if (auto.age < 1) taxes = 5000;
        // Some code
        return taxes;
    }
}
