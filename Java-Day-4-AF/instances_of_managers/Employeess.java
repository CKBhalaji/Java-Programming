public class Employeess {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 101, 15.0);
        Developer developer = new Developer("Jane Smith", 102, "Java");

        System.out.println(manager);
        System.out.println("Salary: $" + manager.calculateSalary());
        System.out.println();

        System.out.println(developer);
        System.out.println("Salary: $" + developer.calculateSalary());
    }
}
