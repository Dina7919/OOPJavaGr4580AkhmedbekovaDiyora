package OCP;
public class Bus extends SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.8;
        } 
}
