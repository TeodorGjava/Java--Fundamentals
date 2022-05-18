package Fundamentals.BasicSyntax.Exercise.MoreExercise;

import java.util.Scanner;

public class Password {
    private static StringBuffer stv;

    public static Object guess(String username){
        StringBuilder str = new StringBuilder(username);



        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries= 0;
        String username = sc.nextLine();
        String pass = (String) guess(username);
        for (int i = 0; i < 4; i++) {
            String str = sc.nextLine();

            if(str.equals(pass)){
                System.out.println("User "+ username + " logged in");
                break;
            }else if(tries <=3){
                tries ++;
                if (tries>3){
                    System.out.println("User "+ str +" blocked!");
                    break;
                }

                System.out.println("Incorrect password. Try again.");

            }
        }

    }

}
