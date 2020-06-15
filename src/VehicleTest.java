public class VehicleTest {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Car b = new Car();
        Jet c = new Jet();

        a.setOperable(true);
        a.setPassengerCapacity(2);
        a.setPowerSource("gas");

        b.setOperable(false);
        b.setPassengerCapacity(5);
        b.setPowerSource("electric");

        c.setOperable(true);
        c.setPassengerCapacity(8);
        c.setPowerSource("hydrokinetic friction");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
