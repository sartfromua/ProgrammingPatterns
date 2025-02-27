package lab_12.task01;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
	List<Engine> engines = new ArrayList<>();
	List<Wheel> wheels = new ArrayList<>();

	private Engine findEngine(Engine.FuelType fuel, int fuelConsumption, int fuelCapacity) {
		for (Engine engine : engines) {
			if (engine.fuelCapacity == fuelCapacity && engine.fuelType == fuel && engine.fuelConsumption == fuelConsumption) {
				return engine;
			}
		}
		return null;
	}

	private Wheel findWheel(Wheel.Material wheelMaterial, int wheelRadius) {
		for (Wheel wheel : wheels) {
			if (wheel.material == wheelMaterial && wheel.radius == wheelRadius) {
				return wheel;
			}
		}
		return null;
	}

	public void getStatistics(){
		System.out.println("\nStatistics:");
		System.out.println("Engines: " + engines.size());
		System.out.println("Wheels: " + wheels.size());
	}

	Car build(Engine.FuelType fuel, int fuelConsumption, int fuelCapacity, Wheel.Material wheelMaterial, int wheelRadius) {
		Engine engine = findEngine(fuel, fuelConsumption, fuelCapacity);
		Wheel wheel = findWheel(wheelMaterial, wheelRadius);
		if (engine == null) {
			engine = new Engine(fuel, fuelCapacity, fuelConsumption);
			engines.add(engine);
		}
		if (wheel == null) {
			wheel = new Wheel(wheelRadius, wheelMaterial);
			wheels.add(wheel);
		}
		return new Car(engine, wheel);
	}
}
