package lab_09.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Worker {

    private final List<Worker> workers = new ArrayList<>();

    SalesTeam(Worker... workers) {
		this.workers.addAll(Arrays.asList(workers));
    }

    void addWorker(Worker worker) {
        workers.add(worker);
    }

    public int payExpenses() {
        System.out.println("===========================");
        int total = 0;
        for (Worker worker : workers) {
            total += worker.payExpenses();
        }
        System.out.println("Team was paid $" + total);
        System.out.println("===========================");
        return total;
    }

}
