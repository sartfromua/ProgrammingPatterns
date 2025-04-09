package lab_16.task03;


import java.awt.*;

public class Item extends Component {

    private final String name;
    private final int value;


    public Item(String name, int value) {

        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void execute() {
        System.out.println(this);
    }
}
