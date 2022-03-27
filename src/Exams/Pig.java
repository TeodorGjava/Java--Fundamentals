package Exams;

import java.util.Scanner;

public class Pig {
    static void feed(double foodKg, double hayKg, double coverKg, double pigWeightKg) {
        double coverInGr = coverKg * 1000;
        double pigWeightGr= pigWeightKg*1000;
        double foodInGr = foodKg * 1000;
        double hayInGr = hayKg * 1000;
        for (int i = 1; i <= 30; i++) {
            foodInGr -= 300;
            if (i % 2 == 0) {
                hayInGr -= foodInGr * 0.05;
            }
            if (i % 3 == 0) {
                coverInGr-=pigWeightGr/3;
            }
            if(coverInGr<=0||foodInGr<=0||hayInGr<=0){
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }if(coverInGr>=0&&foodInGr>=0&&hayInGr>=0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodInGr/1000,hayInGr/1000,coverInGr/1000);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        feed(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
    }
}
