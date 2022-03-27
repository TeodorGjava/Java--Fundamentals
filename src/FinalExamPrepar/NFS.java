package FinalExamPrepar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS {
    static class Car{
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
        Map<String,Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] input = sc.nextLine().split("[|]");
            Car car = new Car(input[0],Integer.parseInt(input[1]),Integer.parseInt(input[2]));
            carMap.put(input[0],car);
        }
        String command = sc.nextLine();
        while (!command.equals("Stop")){
            String[] line = command.split(" : ");
            switch (line[0]){
                case"Drive":

                    break;
                case"1":
                    break;
                case "":
                    break;
            }
        }
    }
}
