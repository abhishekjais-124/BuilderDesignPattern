public class VehicleBuilder {
    public int wheelsCount;
    public String engineType;
    public int airBagsCount;

    public VehicleBuilder( int wheelsCount, String engineType ){
        this.wheelsCount = wheelsCount;
        this.engineType = engineType;
    }

    public VehicleBuilder setAirBagsCount(int airBagsCount){
        this.airBagsCount = airBagsCount;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(this);
    }

}
