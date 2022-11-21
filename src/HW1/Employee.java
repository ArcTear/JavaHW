package HW1;

public abstract class Employee {
    protected int salary;
    protected String name;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public abstract void sayHello();
    @Override
    public String toString() {
        return "HW1.Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
