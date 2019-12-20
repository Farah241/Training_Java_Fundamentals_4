public class Employee {
  private String name;
  private int id;
  private double salary;

  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public Employee() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

//  abstract void raiseSalary(double salary);

  public void printEmployee(){
    System.out.println("Nama : " + name + "ID : " +id + "Salary :" +salary);
  }

  public void printEmployee (boolean isPrintSalary){
    if (isPrintSalary == true){
      System.out.println("Nama : " + name + " ID : " +id + " Salary :" +salary);
    } else {
      System.out.println("Nama : " + name + " ID : " +id);
    }
  }
}
