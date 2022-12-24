public class Main {
    public static void main(String[] args) {

        Vehicle car = new VehicleBuilder(4, "audi").setAirBagsCount(2).build();
        System.out.println(car.getEngineType());
        System.out.println(car.getWheelsCount());
        System.out.println(car.getAirBagsCount());

        Vehicle bike = new VehicleBuilder(2, "hero").build();
        System.out.println(bike.getEngineType());
        System.out.println(bike.getWheelsCount());
        System.out.println(bike.getAirBagsCount());

    }
}