package lab_23.task01;

public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));

        System.out.println("Total amount paid to staff: " + staffList.getSalary());

        staffList.acceptVisitor(new IncreaseSalaryVisitor(30));
        System.out.println("Total amount paid to staff: " + staffList.getSalary());
        staffList.acceptVisitor(new PenaltyVisitor(10000));
        System.out.println("Total amount paid to staff: " + staffList.getSalary());
    }

}
