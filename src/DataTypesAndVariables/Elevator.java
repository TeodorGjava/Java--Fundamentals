package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int cap = Integer.parseInt(sc.nextLine());
        if (people%cap==0){
            System.out.println(people/cap);
        }else if(people%cap<=cap){
            System.out.println(people/cap +1);
        }
    }
}
