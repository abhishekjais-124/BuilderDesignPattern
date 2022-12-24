public class Vehicle {
    private int wheelsCount;
    private String engineType;
    private int airBagsCount; //optional parameter

    Vehicle(VehicleBuilder builder){
        this.wheelsCount = builder.wheelsCount;
        this.engineType = builder.engineType;
        this.airBagsCount = builder.airBagsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getAirBagsCount() {
        return airBagsCount;
    }
}
