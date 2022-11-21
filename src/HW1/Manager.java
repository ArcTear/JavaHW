package HW1;

public class Manager extends Employee implements Gradable{
    private int numberOfSubordinates;
    private int grade;

    public Manager(String name, int salary, int numberOfSubordinates) {
        super(name, salary);
        grade = 0;
        this.numberOfSubordinates = numberOfSubordinates;

    }
    protected Manager(String name, int salary){
        super(name, salary);
        grade = 0;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi! I'm manager!");
    }

    @Override
    public String toString() {
        return "HW1.Manager{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", numberOfSubordinates=" + numberOfSubordinates +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean passedTest() {
        return grade <= 3;
    }

    @Override
    public void getGrade() {
        if (passedTest()){
            grade++;
            salary *= 1.2;
        } else {
            salary += Gradable.getBonus();
        }
    }

}
