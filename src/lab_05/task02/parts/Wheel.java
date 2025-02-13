package lab_05.task02.parts;

public class Wheel implements Prototype {
    private final int size;
    private final Material material;

    @Override
    public Wheel clone() {
        return new Wheel(this);
    }

    public enum Material {
        STEEL, CHROME, ALUMINIUM
    }

    public Wheel(int size, Material material) {
        this.size = size;
        this.material = material;
    }


    protected Wheel(Wheel other) {
        this.size = other.size;
        this.material = other.material;
    }




    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", material=" + material +
                '}';
    }
}
