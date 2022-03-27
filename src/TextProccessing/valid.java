package TextProccessing;

import java.util.Arrays;
import java.util.Scanner;

public class valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split(", ")).filter(username->username.length()>=3&&username.length()<=16)
                .filter(username->username.matches("[a-zA-Z_\\-\\d]+")).forEach(System.out::println);
    }
}


