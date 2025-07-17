public abstract class Vehicle {

    protected int capacity;
    protected int numOfPassengers;
    protected String startPoint;
    protected String endPoint;

    public Vehicle (int numOfPassengers,
    String startPoint, String endPoint) {
        
        this.numOfPassengers = numOfPassengers;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumOfPassengers() {
        return this.numOfPassengers;
    }

    public String getStartPoint(){
        return this.getStartPoint;
    }

    public String getEndPoint() {
        return this.endPoint;
    }

    public int setCapacity(int capacity) {
       this.capacity = capacity;
    }

    public int setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String setStartPoint(String startPoint){
        this.getStartPoint = startPoint;
    }

    public String setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
    
}