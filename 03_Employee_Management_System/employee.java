import java.util.ArrayList;
import java.util.List;

class employee {
    private int id;
    private String name;
    private double salary;

    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();
        employees.add(new employee(101, "Pracheta Kamal", 50000));
        employees.add(new employee(102, "John", 60000));
        employees.add(new employee(103, "Doe", 55000));

        System.out.println("Employee Details:");
        System.out.println("=========================");
        for (employee emp : employees) {
            emp.displayDetails();
        }
    }
}
