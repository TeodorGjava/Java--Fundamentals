package TextProccessing;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        for(char c: arr){
            c+=3;
            System.out.print((char)c);
        }

    }
}
