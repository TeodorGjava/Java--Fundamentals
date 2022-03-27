package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double budget = 0;
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;
        while (!input.equals("Start")) {
            double n = Double.parseDouble(input);
            if (n != 0.10 && n != 0.2 && n != 0.5 && n != 1.0 && n != 2.0) {
                System.out.printf("Cannot accept %.2f\n", n);
            } else {
                budget += n;
            }
            input = sc.nextLine();
        }

        String products = sc.nextLine();

            while(!products.equals("End")) {

                switch (products){
                case "Nuts":
                    if (budget >= nuts) {
                        budget -= nuts;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (budget >= water) {
                        budget -= water;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (budget >= crisps) {
                        budget -= crisps;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (budget >= soda) {
                        budget -= soda;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (budget >= coke) {
                        budget -= coke;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                    default:
                        System.out.println("Invalid product");
            }products= sc.nextLine();

            if(products.equals("End"))
        System.out.printf("Change: %.2f", budget);
    }
}}
