class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(double speed, int numWheels) {
        super(speed);
        this.numWheels = numWheels;
    }

    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numWheels;
    }
}
