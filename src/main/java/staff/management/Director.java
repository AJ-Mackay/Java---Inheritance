package staff.management;
import staff.Employee;

public class Director extends Employee {

    private double budget;
    String deptName;

    public Director(String name, String niNumber, double salary, double budget, String deptName){
        super(name, niNumber, salary);
        this.budget = budget;
        this.deptName = deptName;
    }

    public double getBudget(){
        return budget;
    }

    public String getDeptName(){
        return deptName;
    }
}