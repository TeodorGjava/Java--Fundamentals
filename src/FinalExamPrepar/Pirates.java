package FinalExamPrepar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    static class Town {
        String name;
        int population;
        int gold;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public Town(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }
        public Town(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        Map<String, Town> townMap = new LinkedHashMap<>();
        while (!command.equals("Sail")) {
            String[] line = command.split("[|]{2}");
            String city = line[0];
            int population = Integer.parseInt(line[1]);
            int gold = Integer.parseInt(line[2]);

            if (!townMap.containsKey(city)) {
                Town town = new Town(city, population, gold);
                townMap.put(town.getName(), town);
            } else {
                townMap.get(city).setPopulation(townMap.get(city).getPopulation()+population);
                townMap.get(city).setGold(townMap.get(city).getGold()+gold);

            }
            command = sc.nextLine();
        }
        String command2 = sc.nextLine();
        while (!command2.equals("End")){
            String[] line = command2.split("=>");
            String action = line[0];
            if(action.equals("Plunder")){
                plunder(townMap,line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]));
            }
            if(action.equals("Prosper")){
                prosper(townMap,line[1],Integer.parseInt(line[2]));
            }
            command2 = sc.nextLine();
        }
        if(townMap.isEmpty()){
            System.out.printf("Ahoy, Captain! All targets have been plundered and destroyed!%n");
        }else{
            System.out.printf("Ahoy, Captain! There are %s wealthy settlements to go to:%n",townMap.size());
            townMap.forEach((x,y)->{
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",x,y.getPopulation(),y.getGold());
            });
        }
    }

    private static void prosper(Map<String, Town> townMap, String name, int gold) {
    if(gold>0){
        Town town = townMap.get(name);
        town.setGold(town.getGold()+gold);
        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,town.getName(),town.getGold());
    }else{
        System.out.printf("Gold added cannot be a negative number!%n");
    }
    }

    private static void plunder(Map<String, Town> townMap, String name, int people, int gold) {
    Town town = townMap.get(name);
    town.setGold(town.getGold()-gold);
    town.setPopulation(town.getPopulation()-people);
        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town.getName(),gold,people);
    if(town.getGold()<=0||town.getPopulation()<=0){
        townMap.remove(name);
        System.out.printf("%s has been wiped off the map!%n",town.getName());
    }

    }
}
