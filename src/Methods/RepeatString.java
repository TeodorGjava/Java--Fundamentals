package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void repeat(int index,String input){
        for (int i = 0; i <index ; i++) {
            System.out.print(input);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = Integer.parseInt(sc.nextLine());
        repeat(index,input);
    }
}
