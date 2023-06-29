package ex3;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class Report
{
    Employee[] employees;
    public Report(Employee...employees)
    {
        this.employees = employees;
    }
    public void showReports()
    {
        for (int i = 0; i < Array.getLength(employees); i++) {
            System.out.println(String.format("%15s : %.2f", (employees[i].getFullName()+ " ".repeat(15)).substring(0, 15),
                    employees[i].getSalary()));
        }
    }
}

//15s