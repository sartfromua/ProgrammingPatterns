package lab_12.task01;

public class Wheel {
	public enum Material{
		Steel,
		Wolfram,
		Aluminium,
		Titanium
	}

	int radius;
	Material material;

	Wheel(int radius, Material material){
		this.radius = radius;
		this.material = material;
	}

}
