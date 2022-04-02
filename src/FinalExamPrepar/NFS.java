package FinalExamPrepar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS {
    static class Car {
        String model;
        int km;
        int fuel;

        public Car(String model, int km, int fuel) {
            this.model = model;
            this.km = km;
            this.fuel = fuel;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getKm() {
            return km;
        }

        public void setKm(int km) {
            this.km = km;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("[|]");
            Car car = new Car(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            carMap.put(input[0], car);
        }
        String command = sc.nextLine();
        while (!command.equals("Stop")) {
            String[] line = command.split(" : ");
            switch (line[0]) {
                case "Drive":
                    String car = line[1];
                    int distance = Integer.parseInt(line[2]);
                    int fuel = Integer.parseInt(line[3]);
                    if (carMap.get(car).getFuel() >= fuel) {
                        carMap.get(car).setKm(carMap.get(car).getKm() + distance);
                        carMap.get(car).setFuel(carMap.get(car).getFuel() - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (carMap.get(car).getKm() >= 100000) {
                        System.out.println("Time to sell the " + carMap.get(car).getModel() + "!");
                        carMap.remove(car);
                    }
                    break;
                case "Refuel":
                    int needed = 75 - carMap.get(line[1]).getFuel();
                    if (carMap.get(line[1]).getFuel() + Integer.parseInt(line[2]) > 75) {
                        carMap.get(line[1]).setFuel(75);
                        System.out.printf("%s refueled with %d liters%n", line[1], needed);
                    } else {
                        carMap.get(line[1]).setFuel(carMap.get(line[1]).getFuel()+Integer.parseInt(line[2]));
                        System.out.printf("%s refueled with %d liters%n",line[1],Integer.parseInt(line[2]));
                    }
                    break;
                case "Revert":
                    if (carMap.get(line[1]).getKm() - Integer.parseInt(line[2]) > 10000) {
                        carMap.get(line[1]).setKm(carMap.get(line[1]).getKm() - Integer.parseInt(line[2]));
                        System.out.printf("%s mileage decreased by %d kilometers%n", line[1], Integer.parseInt(line[2]));
                    } else {
                        carMap.get(line[1]).setKm(10000);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().getKm(), entry.getValue().getFuel());
        }

    }
}
