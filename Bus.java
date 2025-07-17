public class Bus extends Vehicle implements Public {

    private int fare = 30;

    public Bus (int numOfPassengers, String startPoint, String endPoint) {
        this.capacity = 30;
        super(numOfPassengers,startPoint,endPoint);
    }

    public int getFare() {
        return this.fare;
    }

    public void setFare(int distance) {
        this.fare = 30;
    }  

    @Override
    public String toString() {

        return "Vehicle: Bus\n Maximum Capacity: " + this.capacity + "\n Start: " + this.startPoint + "\n End: " + this.endPoint + "\n Fare: " + this.fare;
    }

}
