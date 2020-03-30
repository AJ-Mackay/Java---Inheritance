package staff;

public abstract class Employee {

    String name;
    String niNumber;
    double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNiNumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(double amount) {
        salary += amount;
        return salary;
    }

    public double payBonus(){
        double bonus = salary / 100.0;
        return salary + bonus;
    }

}
