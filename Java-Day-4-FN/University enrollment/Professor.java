class Professor extends Person {
    private int employeeId;

    public Professor(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
