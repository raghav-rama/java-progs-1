public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void raiseSalary(double percent) {
        salary += salary * percent / 100.0;
    }
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, "John Doe", 1000.00);

        // Print the initial salary
        System.out.println("Initial salary: " + emp.getSalary());

        // Give the employee a 10% raise
        emp.raiseSalary(10.0);

        // Print the salary after the raise
        System.out.println("Salary after raise: " + emp.getSalary());
    }
}

