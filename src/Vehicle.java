public class Vehicle {
    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public Vehicle (){}

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource){
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean isOperable() {
        return isOperable;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
}
