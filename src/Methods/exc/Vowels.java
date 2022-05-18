package MethodsLab.exc;

import java.util.Scanner;

public class Vowels {
    private static void VowelsCount(String x){
       int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            switch (ch) {
                case 'a': case 'o' : case 'u': case'e': case'i': case 'A': case'O': case'U': case'E': case'I': count++;break;
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        VowelsCount(input);
    }
}
