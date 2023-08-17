package ex2;

public class Car implements Comparable, Cloneable{
    protected int engineCapacity;
    protected int noOfDoors;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }


    public void startEngine(){
        this.startElectroMotor();
        this.injectFuelInEngine();
        this.startSpark();
        this.runEngine();
    }

    private void startElectroMotor(){}
    private void injectFuelInEngine(){}
    private void startSpark(){}
    private void runEngine(){}

    @Override
    public int compareTo(Object o) {
        Car otherCar = (Car) o;
        return this.price - otherCar.getPrice();
    }

    @Override
    public Object clone(){
        Car c = new Car();
        c.setPrice(this.price);
        c.setEngineCapacity(this.engineCapacity);
        c.setNoOfDoors(this.noOfDoors);
        return c;
    }
}
