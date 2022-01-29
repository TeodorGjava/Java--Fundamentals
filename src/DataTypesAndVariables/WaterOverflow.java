package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int waterTank = 255;
       int sum = 0;
       int sum2= 0;
       int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            int input = Integer.parseInt(sc.nextLine());
            sum+=input;
            if(input>waterTank||sum>waterTank){
                sum-=input;
                System.out.println("Insufficient capacity!");
            }else {
                sum2+=input;
            }
        }
        System.out.println(sum2);
    }
}
