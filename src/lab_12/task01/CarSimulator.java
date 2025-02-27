package lab_12.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarSimulator {
	public static void main(String[] args) {
		Random rand = new Random();
		List<Car> cars = new ArrayList<>();
		CarBuilder builder = new CarBuilder();
		for (int i = 0; i < 10000; i++) {
			Engine.FuelType fuelType = Engine.FuelType.values()[rand.nextInt(Engine.FuelType.values().length)];
			int fuelConsumption = 10 + rand.nextInt(10);
			int fuelCapacity = 100 + rand.nextInt(10)*20;
			Wheel.Material wheelMaterial = Wheel.Material.values()[rand.nextInt(Wheel.Material.values().length)];
			int wheelRadius = 40 + rand.nextInt(5);
			cars.add(builder.build(fuelType, fuelConsumption, fuelCapacity, wheelMaterial, wheelRadius));
		}
		System.out.println("Cars: " + cars.size());
		builder.getStatistics();

	}
}
