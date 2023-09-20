package ObjectCreation.Static.Employee;

public class TestCase {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Akhilesh";
        Employee.id = 1101;
        Employee emp2 = new Employee();
        emp2.name = "Antriksh";
        Employee.id = 1102;
        System.out.println(Employee.id);
        System.out.println(emp.name);
    }
}
