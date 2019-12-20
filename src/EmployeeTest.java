public class EmployeeTest {


  public static void main(String[] args) {


    Manager manager = new Manager("Mikha Angelo", 54321,200000,"IT");
    manager.printEmployee();
//    manager.raiseSalary(10000);

    Director director = new Director("Erwin Gutawa", 12345, 30000000, "Marketing", 100000000);
    director.printEmployee();

    Employee employee = new Employee("String", 123, 20000);
    employee.printEmployee(true);
    employee.printEmployee(false);

    }

  }
