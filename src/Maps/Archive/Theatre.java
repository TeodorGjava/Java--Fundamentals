package Maps.Archive;

import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        if (0 <= age && age <= 18) {
            switch (day) {
                case "Weekday":
                    System.out.printf("%d$", 12);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 15);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 5);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        } else if (18 < age && age <= 64) {
            switch (day) {
                case "Weekday":
                    System.out.printf("%d$", 18);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 20);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 12);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }

        } else if (64 < age && age <= 122) {
            switch (day) {
                case "Weekday":
                    System.out.printf("%d$", 12);
                    break;
                case "Weekend":
                    System.out.printf("%d$", 15);
                    break;
                case "Holiday":
                    System.out.printf("%d$", 10);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }else{
            System.out.println("Error!");
        }

    }
}
