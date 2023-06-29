package ex3;

public class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullName() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
