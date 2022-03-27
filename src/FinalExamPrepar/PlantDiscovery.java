package FinalExamPrepar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    static class Plant {
        String name;
        int rarity;
        double rating;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public Plant(int rarity, double rating, String name) {
            this.rarity = rarity;
            this.rating = rating;
            this.name = name;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Plant> plants = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("<->");
            String plant = line[0];
            int rarity = Integer.parseInt(line[1]);
            Plant pl = new Plant(rarity, 0.0, plant);
            plants.put(plant, pl);
        }
        String line = sc.nextLine();
        while (!line.equals("Exhibition")) {
            String[] command = line.split("\\s+");
            {
                switch (command[0]) {
                    case "Rate:":
                        rate(command[1], plants, Double.parseDouble(command[3]));
                        break;
                    case "Update:":
                        update(command[1], plants, Integer.parseInt(command[3]));
                        break;
                    case "Reset:":
                        reset(command[1], plants);
                        break;
                }
            }

            line = sc.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plants.values().forEach(x -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", x.getName(), x.getRarity(), x.getRating());
        });
    }

    private static void reset(String name, Map<String, Plant> plants) {
        if (plants.containsKey(name)) {
            Plant plant = plants.get(name);
            plant.setRating(0.0);
        } else {
            System.out.println("error");
        }
    }

    private static void update(String name, Map<String, Plant> plants, int rarity) {
        if (plants.containsKey(name)) {
            Plant plant = plants.get(name);
            plant.setRarity(rarity);
        } else {
            System.out.println("error");
        }

    }

    private static void rate(String name, Map<String, Plant> plants, double rating) {

        if (plants.containsKey(name)) {
            Plant plant = plants.get(name);
            if (plant.getRating() != 0) {
                plant.setRating((plant.getRating() + rating) / 2);
            } else {
                plant.setRating(rating);
            }
        } else {
            System.out.println("error");
        }
    }


}
