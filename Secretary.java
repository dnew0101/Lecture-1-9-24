//extend keyword gives Secretary class inherited values by default
public class Secretary extends Employee {
    public void takeDiction() {
        System.out.println(getVacationForm());
    }
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
}