package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void price(String product, int quantity){
        double price=0;
        switch (product){
            case "coffee":
                price=1.5*quantity;
                break;
                case "water":
                    price=1.00*quantity;
                break;
                case "coke":
                    price=1.40*quantity;
                break;
                case "snacks":
                    price=2.00*quantity;
                break;
        }
        System.out.printf("%.2f",price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int col = Integer.parseInt(sc.nextLine());
        price(input,col);
    }
}
