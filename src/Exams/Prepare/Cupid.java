package Exams.Prepare;

import java.util.Arrays;
import java.util.Scanner;

public class Cupid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] places = Arrays.stream(sc.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String[] command = sc.nextLine().split(" ");
        int current = 0;
        while (!command[0].equals("Love!")) {
            //TODO:
            int jump = Integer.parseInt(command[1]);
            current += jump;
            if (current >= places.length) {
                current = 0;
            }
            if (places[current] > 0) {
                places[current] -= 2;
                if (places[current] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", current);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", current);
            }

            command = sc.nextLine().split(" ");
        }
        int failed = 0;
        for (int i = 0; i < places.length; i++) {
            if (places[i] != 0) {
                failed++;
            }
        }
        if (failed == 0) {
            System.out.println("Mission was successful");
        } else {
            System.out.printf("Cupid's last position was %d.%n", current);
            System.out.printf("Cupid has failed %d places.%n", failed);
        }
    }
}
