package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double totalPr = 0;
        for (int i = 0; i < n; i++) {
            double price = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int caps = Integer.parseInt(sc.nextLine());
            double current = days *caps * price;
            System.out.printf("The price for the coffee is: $%.2f\n",current);
            totalPr +=current;
        }
        System.out.printf("Total: $%.2f",totalPr);
    }
}
