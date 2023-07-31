package OCP;
public class Car extends SpeedCalculation{
    public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.6;
        }
}

