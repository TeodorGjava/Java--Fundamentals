package Exams.Prepare;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int dayliPlunder = Integer.parseInt(sc.nextLine());
        double goal = Double.parseDouble(sc.nextLine());
        double sum = 0;
        if(days>0&&dayliPlunder>=0&&goal>=0){
        for (int i = 1; i <= days; i++,sum+=dayliPlunder) {
            if (i % 3 == 0) {
                sum -= dayliPlunder;
                sum += dayliPlunder + (dayliPlunder /2.0);
            }if (i % 5 == 0) {
                sum -= sum*0.3;
            }

        }
        if (sum >= goal) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", sum / (goal / 100));
        }
    }}


}
