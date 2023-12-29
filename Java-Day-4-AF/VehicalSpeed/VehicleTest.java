public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(100.0, 4);
        Motorcycle motorcycle = new Motorcycle(120.0, 2);

        System.out.println("Car Speed: " + car.calculateSpeed() + " mph");
        System.out.println("Motorcycle Speed: " + motorcycle.calculateSpeed() + " mph");

        Vehicle fastestVehicle = getFastestVehicle(car, motorcycle);

        System.out.println("\nThe vehicle with the highest effective speed is:");
        System.out.println("Speed: " + fastestVehicle.calculateSpeed() + " mph");
    }

    private static Vehicle getFastestVehicle(Vehicle vehicle1, Vehicle vehicle2) {
        return (vehicle1.calculateSpeed() > vehicle2.calculateSpeed()) ? vehicle1 : vehicle2;
    }
}
