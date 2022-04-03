package FundamentalsFinalExam03April2022;

import java.util.Locale;
import java.util.Scanner;

public class Hogwarts01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spell = sc.nextLine();
        StringBuilder spellBuilder = new StringBuilder(spell);
        String[] command = sc.nextLine().split("\\s+");

        while (!command[0].toUpperCase(Locale.ROOT).equals("ABRACADABRA")) {
            String first = command[0].toUpperCase(Locale.ROOT);
            switch (first) {
                case "ABJURATION":
                    spell = spell.toUpperCase(Locale.ROOT);
                    System.out.println(spell);
                    spellBuilder = new StringBuilder(spell);
                    break;
                case "NECROMANCY":
                    spell = spell.toLowerCase(Locale.ROOT);
                    spellBuilder = new StringBuilder(spell);
                    System.out.println(spell);
                    break;
                case "ILLUSION":
                    int index = Integer.parseInt(command[1]);
                    String letter = command[2];
                    if (index < spell.length()) {
                        char ch = spell.charAt(index);
                        spellBuilder.replace(index, index + 1, letter);
                        System.out.println("Done!");
                        spell = spellBuilder.toString();
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "DIVINATION":
                    String substring = command[1];
                    String replacement = command[2];
                    while (spell.contains(substring)) {
                        int start = spellBuilder.indexOf(substring);
                        int end = start + substring.length();
                        spellBuilder.replace(start, end, replacement);
                        spell = spellBuilder.toString();
                    }
                    System.out.println(spell);
                    break;
                case "ALTERATION":
                    String sub = command[1];
                    while (spell.contains(sub)) {
                        spellBuilder.replace(spell.indexOf(sub), spell.indexOf(sub) + sub.length(), "");
                        spell = spellBuilder.toString();


                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }
            command = sc.nextLine().split("\\s+");
        }
        //

    }
}
