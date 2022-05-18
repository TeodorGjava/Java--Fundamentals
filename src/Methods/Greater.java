package MethodsLab;

import java.util.Scanner;

public class Greater {
    public static int greater(int a, int b) {
        return Math.max(a, b);
    }

    public static char greater(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String greater(String a, String b) {
       if(a.compareTo(b)>=0){
        return a;
       }else{
           return b;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "int":
                System.out.println(greater(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
                break;case "char":
                System.out.println(greater(sc.nextLine(), sc.nextLine()));
                break;case "string":
                System.out.println(greater(sc.nextLine(),sc.nextLine()));
                break;
        }
    }

}
