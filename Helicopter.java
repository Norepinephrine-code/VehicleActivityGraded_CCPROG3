public class Helicopter extends Vehicle {

    public Helicopter (int numOfPassengers, String startPoint, String endPoint) {
        this.capacity = 3;
        super(numOfPassengers,startPoint,endPoint);
    }

    @Override
    public String toString() {

        return "Vehicle: Helicopter\n Maximum Capacity: " + this.capacity + "\n Start: " + this.startPoint + "\n End: " + this.endPoint;
    }

}
