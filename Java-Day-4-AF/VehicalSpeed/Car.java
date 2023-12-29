class Car extends Vehicle {
    private int numPassengers;

    public Car(double speed, int numPassengers) {
        super(speed);
        this.numPassengers = numPassengers;
    }

    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numPassengers;
    }
}
