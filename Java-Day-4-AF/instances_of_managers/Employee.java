class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public double calculateSalary() {
        // Basic salary for all employees is $50,000
        return 50000.0;
    }

    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name;
    }
}
