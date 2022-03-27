package DataTypesAndVariables;

import java.util.Scanner;

public class refactorSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int kolkko = Integer.parseInt(scanner.nextLine());
        int obshto = 0;

        boolean toe = false;
        for (int ch = 1; ch <= kolkko; ch++) {

            if (ch > 10) {
                obshto += ch % 10;
               int ch1 = ch / 10;
               obshto+=ch1;
            }else {

            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
            System.out.printf("%d -> %b%n",ch, toe);
            obshto = 0;

        }

            }


}
