package Exams;

import java.util.Arrays;
import java.util.Scanner;

public class dungeons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] game = sc.nextLine().split("[\\s|]");
        int health = 100;
        int bitCoin = 0;
        boolean death = false;
        for (int i = 0; i < game.length; i += 2) {
                switch (game[i]) {
                    case "potion":
                        if (Integer.parseInt(game[i + 1]) + health > 100) {
                            int diff = health - Integer.parseInt(game[i + 1]);
                            System.out.printf("You healed for %s hp.\n",100-health);
                            health = 100;
                            System.out.printf("Current health: %s hp.\n", health);
                        } else {
                            health += Integer.parseInt(game[i + 1]);
                            System.out.printf("You healed for %s hp.\n", Integer.parseInt(game[i + 1]));
                            System.out.printf("Current health: %s hp.\n", health);
                        }
                        break;
                    case "chest":
                        bitCoin += Integer.parseInt(game[i + 1]);
                        System.out.printf("You found %s bitcoins.%n", Integer.parseInt(game[i + 1]));
                        break;
                    default:
                        // if(Integer.parseInt(game[i+1])< game.length){
                        health -= Integer.parseInt(game[i + 1]);
                        if (health <= 0) {
                            System.out.printf("You died! Killed by %s.%n", game[i]);
                            System.out.printf("Best room: %s%n", (i/2)+1);
                            death = true;
                            break;
                        } else {
                            System.out.printf("You slayed %s.\n", game[i]);
                        }
                }
            if (death) {
                break;
            }

        }
        if (!death) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %s\n", bitCoin);
            System.out.printf("Health: %s", health);
        }
    }
}
