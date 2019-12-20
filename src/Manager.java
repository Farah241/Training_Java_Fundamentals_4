public class Manager extends Employee {
  private String deptName;

  public Manager(String name, int id, double salary, String deptName) {
    super(name, id, salary);
    this.deptName = deptName;
  }

  public Manager(String name) {
    this.deptName = deptName;
  }

  public String getDeptName() {
    return deptName;
  }

//  @Override
//  void raiseSalary(double salary) {
//    salary = salary + (salary * 0.3);
//    System.out.println("Nama : " + getName() + " ID : " +getId() + " Salary :" + getSalary() + " Department name : "+ getDeptName() + "Raise Salary : " + salary);
//
//  }

  public void printEmployee(){
    System.out.println("Nama : " + getName() + " ID : " +getId() + " Salary :" + getSalary() + " Department name : "+ getDeptName());
  }

}
