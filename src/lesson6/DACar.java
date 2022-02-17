package lesson6;
public abstract class DACar {
    private double maxSpeed;

    public double getMaxSpeed( ) { return maxSpeed; }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides( );
}
