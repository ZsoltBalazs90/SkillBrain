package Employee;
/*
Write a Java program to create a class called "Employee" with a name,
salary, and hire date attributes, and a method to calculate years of service.
 */
public class Employee implements Calcul {
    public String nume;
    private double salary;
    public String date;

    public Employee() {
        String name= "Andrei";
    }

    public Employee( String name, String date) {
        this.nume= name;
        this. date= date;
    }


    @Override
    public int period(String currentYear) {
        String startjob= date.split("-")[1];
        return Integer.parseInt(currentYear)- Integer.parseInt(startjob);
    }

    public static void main(String[] args) {
        Employee angajat= new Employee("Andrei","04-2020");
        //angajat.period("2024");
        System.out.println(angajat.period("2024"));
    }
}
