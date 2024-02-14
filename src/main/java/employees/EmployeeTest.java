package employees;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.work();
        employee.getSalary();
        System.out.println("\n");

        HRManager hrManager= new HRManager();
        hrManager.work();
        hrManager.getSalary();
        hrManager.addEmployee();
    }
}
