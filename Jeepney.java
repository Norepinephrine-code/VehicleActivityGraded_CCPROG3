public class Jeepney extends Vehicle implements Public {

    private int fare = 7;

    public Jeepney (int numOfPassengers, String startPoint, String endPoint) {
        this.capacity = 20;
        super(numOfPassengers,startPoint,endPoint);
    }

    public int getFare() {
        return this.fare;
    }

    public void setFare(int distance) {

        if (distance < 5) {
            this.fare = 7;
        } else {
            int extra = distance - 4;
            this.fare += extra;
        }
    }

    @Override
    public String toString() {

        return "Vehicle: Jeepney\n Maximum Capacity: " + this.capacity + "\n Start: " + this.startPoint + "\n End: " + this.endPoint + "\n Fare: " + this.fare;
    }


}
