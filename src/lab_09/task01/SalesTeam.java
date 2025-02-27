package lab_09.task01;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam {

    private final List<Manager> managers = new ArrayList<>();
    private final List<Salesperson> salespeople = new ArrayList<>();

    void addManager(Manager manager) {
        managers.add(manager);
    }

    void addSalesperson(Salesperson salesperson) {
        salespeople.add(salesperson);
    }

    public int payExpenses() {
        System.out.println("===========================");
        int total = 0;
        for (Manager manager : managers) {
            total += manager.payExpenses();
        }

        for (Salesperson salesperson : salespeople) {
            total += salesperson.payExpenses();
        }
        System.out.println("Team was paid $" + total);
        System.out.println("===========================");
        return total;
    }

}
