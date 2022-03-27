package FinalExamPrepar;

import java.util.Scanner;

public class Imitation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("Decode")) {
            String[] str = command.split("[|]");
            String action = str[0];
            switch (action) {
                case "ChangeAll":
                    String substring = str[1];
                    String replacement = str[2];
                    for (int i = 0; i < input.length(); i++) {
                        if (input.charAt(i) == substring.charAt(0)) {
                            input.replace(input.indexOf(substring),input.indexOf(substring)+1,replacement);
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(str[1]);
                    String value = str[2];
                    input.insert(index, value);
                    break;
                case "Move":
                    int numLetters = Integer.parseInt(str[1]);
                    for (int i = 0; i < numLetters; i++) {
                        input.append(input.charAt(0));
                        input.deleteCharAt(0);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println("The decrypted message is: "+input);
    }
}
