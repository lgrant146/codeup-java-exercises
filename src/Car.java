public class Car extends Vehicle {
    private int milesPerGallon;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deplayAirBag(){
        System.out.println("Deploying airbag");

    }


    public static void main(String[] args) {
    }
}
