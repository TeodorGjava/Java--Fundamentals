package TextProccessing.moreEx;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MorseCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> code = new TreeMap<>();
        code.put(".-", "A");
        code.put("-...", "B");
        code.put("-.-.", "C");
        code.put("-..", "D");
        code.put(".", "E");
        code.put("..-.", "F");
        code.put("--.", "G");
        code.put("....", "H");
        code.put("..", "I");
        code.put(".---", "J");
        code.put("-.-", "K");
        code.put(".-..", "L");
        code.put("--", "M");
        code.put("-.", "N");
        code.put("---", "O");
        code.put(".--.", "P");
        code.put("--.-", "Q");
        code.put(".-.", "R");
        code.put("...", "S");
        code.put("-", "T");
        code.put("..-", "U");
        code.put("...-", "V");
        code.put(".--", "W");
        code.put("-..-", "X");
        code.put("-.--", "Y");
        code.put("--..", "Z");
        String[] input = sc.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("|")) {
                result.append(" ");
            } else {
                result.append(code.get(input[i]));
            }
        }
        System.out.println(result);
    }
}
