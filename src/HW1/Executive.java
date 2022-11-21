package HW1;

public class Executive extends Manager {
    int workingHoursPerWeek;

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public Executive(String name, int salary, int workingHoursPerWeek) {
        super(name, salary);
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi! I'm executive!");
    }

    @Override
    public String toString() {
        return "HW1.Executive{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", workingHoursPerWeek=" + workingHoursPerWeek +
                '}';
    }
}
