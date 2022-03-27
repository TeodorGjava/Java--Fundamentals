package Pregovor;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("\\s+");

        for (String s:line
             ) {
            System.out.print(Repeat(s,line.length));
        }

    }
    public static String Repeat(String word, int n){
        char[] arr = new char[word.length()*n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= word.charAt(i% word.length());
        }

        return new String(arr);
    }
}
