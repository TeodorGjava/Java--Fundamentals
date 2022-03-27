package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        String day = sc.nextLine();
        double price = 0;
        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = col * 8.45;
                        break;
                    case "Saturday":
                        price = col * 9.80;
                        break;
                    case "Sunday":
                        price = col * 10.46;
                        break;
                }
                if (col >= 30) {
                    price = price - (price*0.15);
                    System.out.printf("Total price: %.2f", price);
                } else {
                    System.out.printf("Total price: %.2f", price);
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = col * 10.90;
                        break;
                    case "Saturday":
                        price = col * 15.60;
                        break;
                    case "Sunday":
                        price = col * 16;
                        break;
                }
                if (col >= 100) {
                    col -=10;
                    double totalPrice = price*col;

                    System.out.printf("Total price: %.2f", totalPrice);
                } else {
                    System.out.printf("Total price: %.2f", price);
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = col * 15;
                        break;
                    case "Saturday":
                        price = col * 20;
                        break;
                    case "Sunday":
                        price = col * 22.50;
                        break;
                }
                if (10<=col && col <= 20) {
                    price = price - (price*0.05);
                    System.out.printf("Total price: %.2f", price);
                } else {
                    System.out.printf("Total price: %.2f", price);
                }
                break;
        }
    }
}
