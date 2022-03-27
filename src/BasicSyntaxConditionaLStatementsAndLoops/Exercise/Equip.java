package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Equip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = Double.parseDouble(sc.nextLine());
        double students = Double.parseDouble(sc.nextLine());
        double lightmech = Double.parseDouble(sc.nextLine());
        double robes = Double.parseDouble(sc.nextLine());
        double belts = Double.parseDouble(sc.nextLine());
       double countl = Math.ceil(lightmech *1.1);
    double freebelts = belts/6;
    belts -=freebelts;
    double pricelight = countl *students;
    double pricerobes = robes *students;
    double pricebelts = belts *students;
    double price = pricebelts+ pricerobes+ pricelight;
    if (money>price){
        System.out.printf("The money is enough - it would cost %.2flv.",price);
    }else{
        System.out.printf("George Lucas will need %.2flv more.", price- money);
    }
    }
}
