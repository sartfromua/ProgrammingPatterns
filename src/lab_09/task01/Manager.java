package lab_09.task01;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Worker {

    private final String name;
    private final int salary;
//    private final List<Salesperson> salespeople = new ArrayList<>();

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int payExpenses() {
        System.out.println(name + " has been paid $" + salary);
        return salary;
    }

}
