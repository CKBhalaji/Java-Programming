public class Members {
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Main Street, City";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 35;
        manager.phoneNumber = "9876543210";
        manager.address = "456 Oak Street, Town";
        manager.salary = 80000.0;
        manager.department = "Operations";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary(); // Using the printSalary method
        System.out.println("Specialization: " + employee.specialization);
        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary(); // Using the printSalary method
        System.out.println("Department: " + manager.department);
    }
}
