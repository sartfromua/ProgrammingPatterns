package lab_03.task01;

import lab_03.task01.factories.AbstractFactory;
import lab_03.task01.factories.HyundaiFactory;
import lab_03.task01.factories.SkodaFactory;
import lab_03.task01.factories.VolvoFactory;
import lab_03.task01.products.AbstractBus;
import lab_03.task01.products.AbstractTramway;
import lab_03.task01.products.AbstractTrolleybus;

public class Administration {
    static AbstractFactory hyundaiFactory = new HyundaiFactory();
    static AbstractFactory volvoFactory = new VolvoFactory();
    static AbstractFactory skodaFactory = new SkodaFactory();

    static Integer countForFactory(AbstractFactory factory, int busNumber, int trolleybusNumber, int tramwayNumber, int exploitTime) {
        AbstractBus bus = factory.getBus();
        AbstractTramway tramway = factory.getTramway();
        AbstractTrolleybus trolleybus = factory.getTrolleybus();
        int result = 0;
        result += bus.getPrice() * busNumber + bus.getOperatingCosts() * exploitTime;
        result += tramway.getPrice() * tramwayNumber + tramway.getOperatingCosts() * exploitTime;
        result += trolleybus.getPrice() * trolleybusNumber + trolleybus.getOperatingCosts() * exploitTime;
        return result;
    }


    public static void main(String[] args) {
        Integer buses = 15;
        Integer trolleys = 25;
        Integer tramways = 30;
        Integer expTime = 480000;

        System.out.println("Skoda cost: " + countForFactory(skodaFactory, buses, trolleys, tramways, expTime));
        System.out.println("Volvo cost: " + countForFactory(volvoFactory, buses, trolleys, tramways, expTime));
        System.out.println("Hyundai cost: " + countForFactory(hyundaiFactory, buses, trolleys, tramways, expTime));

    }
}
