public class HybridCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize ;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("HybridCar ->  switch %d cylinders , Ready!%n ", cylinders);
        System.out.printf("HybridCar ->  switch %d kWh battery on, Ready!%n ", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HybridCar -> usage under the average: %.2f %n ", avgKmPerLiter);

    }
}

