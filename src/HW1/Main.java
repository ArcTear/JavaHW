package HW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Andrew", 80_000, 10));
        employees.add(new Programmer("Vladimir", 100_000, "Java"));
        employees.add(new Secretary("Valeria", 50_000, "Renting car"));
        employees.add(new Executive("Anton", 40_000, 40));
        System.out.println(employees);
        for (Employee employee : employees) {
            employee.sayHello();
        }
        var programmer = new Programmer("Vladimir", 100_000, "Java");
        var manager = new Manager("Andrew", 80_000, 10);
        System.out.println(manager.getSalary());
        System.out.println(programmer.getSalary());
        programmer.getGrade();
        manager.getGrade();
        System.out.println(manager.getSalary());
        System.out.println(programmer.getSalary());
    }
}
