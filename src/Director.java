public class Director extends Manager {
  private double budget;

  public Director(String name, int id, double salary, String deptName, double budget) {
    super(name, id, salary, deptName);
    this.budget = budget;
  }

  public double getBudget() {
    return budget;
  }

  public void printEmployee (){
    System.out.println("Nama : " + getName() + " ID : " +getId()+ " Salary : " +getSalary()+ " Department name : " +getDeptName() + " Budget : " +getBudget());
  }

//  @Override
//  void raiseSalary(double salary) {
//    salary = salary + (salary * 0.5);
//  }
}
