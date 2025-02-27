package lab_09.task01;

public class ExpensesClient {

  public static void main(String[] args) {
    Director bohdan = new Director("Bohdan", 1000);
    Manager jane = new Manager("Jane", 500);
    Salesperson bob = new Salesperson("Bob", 300, jane);
    Salesperson sue = new Salesperson("Sue", 200, jane);

    SalesTeam teamMeat = new SalesTeam();
    teamMeat.addManager(jane);
    teamMeat.addSalesperson(bob);
    teamMeat.addSalesperson(sue);
    teamMeat.addSalesperson(new Salesperson("John", 200, jane));

    SalesTeam teamMilk = new SalesTeam();
    teamMilk.addManager(new Manager("Den", 450));
    teamMilk.addSalesperson(new Salesperson("Antony", 220, jane));
    teamMilk.addSalesperson(new Salesperson("Alice", 240, jane));
    teamMilk.addSalesperson(new Salesperson("Rick", 180, jane));

    SalesTeam teamSweet = new SalesTeam();
    teamSweet.addManager(new Manager("Kelly", 550));
    teamSweet.addSalesperson(new Salesperson("Kate", 300, jane));
    teamSweet.addSalesperson(new Salesperson("Lincoln", 290, jane));
    teamSweet.addSalesperson(new Salesperson("Ted", 330, jane));

    bohdan.addTeam(teamMeat);
    bohdan.addTeam(teamMilk);
    bohdan.addTeam(teamSweet);

    payExpenses(bohdan);
  }

  private static void payExpenses(Director director) {
    System.out.println("Expenses have been requested");
    director.payExpenses();
    System.out.println("Expenses have been paid\n");
  }

}
