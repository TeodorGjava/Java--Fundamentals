package Exams;

import java.util.Scanner;

public class SoftUniReception {
    private static void time(int a, int b , int c , int students){
        int studentsPerH= a+b+c;
        int hours =0;
        for(int i = students;students>0;students-=studentsPerH){
            hours+=1;
            if(hours%4==0){
                students+=studentsPerH;
            }
        }
        System.out.printf("Time needed: %sh.",hours);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
    }
}
