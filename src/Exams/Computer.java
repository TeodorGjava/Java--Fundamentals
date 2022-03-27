package Exams;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double sum = 0;
        while ((!input.equals("special") && !input.equals("regular"))) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
                input = sc.nextLine();
            } else {
                sum += price;
                input = sc.nextLine();
            }
        }
        double total = sum * 1.2;
        if (input.equals("special")) {
            if(sum==0){
                System.out.print("Invalid order!");
            }else{
            double totalSpecial = total * 0.9;
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$", sum, total - sum, totalSpecial);
        }}
        if (input.equals("regular")) {
            if(sum==0){
                System.out.print("Invalid order!");
            }else{
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$", sum, total - sum, sum + sum * 0.2);
        }}

    }
}
