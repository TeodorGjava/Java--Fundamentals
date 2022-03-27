package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCities = Integer.parseInt(sc.nextLine());
        double total = 0;
        for (int i = 1; i <= numCities; i++) {
            String name = sc.nextLine();
            double income = Double.parseDouble(sc.nextLine());
            double expenses = Double.parseDouble(sc.nextLine());
            if(i % 3 == 0 && i % 5 != 0){
                expenses+= expenses/2;
            }
            if(i%5==0){
                income-=income*0.1;
            }
            double profit = income - expenses;
            total+=profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n",name,profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",total);
    }
}
