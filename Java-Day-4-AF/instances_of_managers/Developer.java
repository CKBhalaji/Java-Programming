class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 10000.0; // Adding a fixed allowance for developers
    }

    @Override
    public String toString() {
        return super.toString() + ", Role: Developer, Programming Language: " + programmingLanguage;
    }
}
