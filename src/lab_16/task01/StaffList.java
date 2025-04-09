package lab_16.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class StaffList implements Iterable<Employee> {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getElements() {
        return employees;
    }

    @Override
    public java.util.Iterator<Employee> iterator() {
        return new StaffListIterator(this);
    }
}
