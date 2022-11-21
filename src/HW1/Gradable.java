package HW1;

public interface Gradable {
    public boolean passedTest();
    public void getGrade();
    public static int getBonus(){
        return 10_000;
    }
}
