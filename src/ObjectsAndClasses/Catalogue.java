package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Catalogue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();


        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("End")) {

                Vehicle vehicle = new Vehicle(command[0],command[1],command[2],Integer.parseInt(command[3]));
                vehicles.add(vehicle);

            command = sc.nextLine().split(" ");
        }
        String choose = sc.nextLine();
        while (!choose.equals("Close the Catalogue")){
            String finalChoose = choose;
            vehicles.stream().filter(vehicle -> vehicle.getModel().equals(finalChoose)).forEach(vehicle -> System.out.print(vehicle.toString()));
            choose = sc.nextLine();
        }
       List<Vehicle> cars = vehicles.stream().filter(vehicle -> vehicle.getType().equals("car")).collect(Collectors.toList());
       List<Vehicle> trucks = vehicles.stream().filter(vehicle -> vehicle.getType().equals("truck")).collect(Collectors.toList());

        double carsAvg = cars.stream().mapToDouble(Vehicle::getHp).sum() / cars.size();
        double trucksAvg = trucks.stream().mapToDouble(Vehicle::getHp).sum() / trucks.size();
        if(trucks.size()==0){
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvg);
            System.out.print("Trucks have average horsepower of: 0.00.");
        }else if(cars.size()==0){
        System.out.printf("Cars have average horsepower of: 0.00.%n");
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvg);
    }else{
            System.out.printf("Cars have average horsepower of: %.2f.%n",carsAvg);
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvg);
        }}

    static class Vehicle {
        public Vehicle(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        String type;

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d%n", getType().toUpperCase().charAt(0)+getType().substring(1), this.model, this.color, this.hp);
        }

        String model;
        String color;
        int hp;

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHp() {
            return hp;
        }
    }
}
