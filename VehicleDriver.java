import java.util.*;

public class VehicleDriver{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        boolean exit = false;
        int input = -1;
        
        while (exit==false){
        System.out.println("Input vehicle: ");
        System.out.println("1. Bus" + "\n2. Jeepney" + "\n3. Helicopter" + "\n0. Exit"); 

        input = sc.nextInt();

        switch (input) {
            case 1: 
                vehicles.add(new Bus(13, "Cubao", "Leon Guinto"));
                break;
            case 2:
                vehicles.add(new Jeepney(10, "Makati", "Guadalupe"));
                break;
            case 3: 
                vehicles.add(new Helicopter(2, "Detroit", "Los Angeles"));
                break;
            case 0: exit = true; break
            default: System.out.println("Error reached at Switch case!");
        }

        for (Vehicle v: vehicles) {
            System.out.println(vehicles.toString());
        }

        }

    }
}