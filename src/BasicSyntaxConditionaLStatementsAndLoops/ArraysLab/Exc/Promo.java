package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*A theatre is doing a ticket sale, but they need a program to calculate the price of a single ticket.
         If the given age does not fit one of the categories, you should print "Error!".
          You can see the prices in the table below:

          The input comes in two lines. On the first line, you will receive the type of day. On the second – the age of the person.
         */
    String day = sc.nextLine();
    int age = Integer.parseInt(sc.nextLine());

int price=0;
switch (day){
    case "Weekday":
        if (0<=age&&age<=18){
            price +=12;
        }else if(18<age&&age<=64){
        price += 18;
            System.out.println(price+"$");
        }else if(64<=age&&age<=122){
            price += 12;
            System.out.println(price+"$");
        }else{
            System.out.println("Error!");
        }
        break;
    case "Holiday":
        if (0<=age&&age<=18){
            price +=5;
            System.out.println(price+"$");
        }else if(18<age&&age<=64){
            price += 12;
            System.out.println(price+"$");

        }else if(64<=age&&age<=122){
            price += 10;
            System.out.println(price+"$");
        }else{
            System.out.println("Error!");
        }
        break;
    case "Weekend":
        if (0<=age&&age<=18){
            price +=15;
        }else if(18<age&&age<=64){
            price += 20;
            System.out.println(price+"$");

        }else if(64<=age&&age<=122){
            price += 15;
            System.out.println(price+"$");
        }else{
            System.out.println("Error!");
        }
        break;
}
    }
}
