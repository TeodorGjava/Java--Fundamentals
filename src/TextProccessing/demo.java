package TextProccessing;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String thing = sc.nextLine();
        while (!thing.equals("end")){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(thing);
            System.out.println(thing +" = " + stringBuilder.reverse());
            thing= sc.nextLine();
        }
    }
}
