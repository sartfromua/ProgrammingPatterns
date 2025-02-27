package lab_12.task01;

public class Engine {
	enum FuelType {
		DIESEL,
		GASOLINE,
		ELECTRIC
	}

	FuelType fuelType;
	int fuelCapacity;
	int fuelConsumption;

	Engine(FuelType fuelType, int fuelCapacity, int fuelConsumption) {
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}
}
