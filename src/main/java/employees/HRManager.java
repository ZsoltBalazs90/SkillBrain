package employees;

public class HRManager extends Employee{
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources");
    }

    @Override
    public void getSalary() {
        System.out.println("The salary of the HRManager is 8000$");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}
