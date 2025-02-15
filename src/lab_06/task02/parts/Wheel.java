package lab_06.task02.parts;

public class Wheel {
    public enum Material {
        STEEL, CHROME, ALUMINIUM
    }

    public Wheel(int size, Material material) {
        this.size = size;
        this.material = material;
    }


    private final int size;
    private final Material material;

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", material=" + material +
                '}';
    }
}
