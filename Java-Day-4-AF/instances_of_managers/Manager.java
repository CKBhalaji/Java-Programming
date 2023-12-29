class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String name, int employeeId, double bonusPercentage) {
        super(name, employeeId);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + super.calculateSalary() * (bonusPercentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Role: Manager, Bonus Percentage: " + bonusPercentage + "%";
    }
}
