package TextProccessing.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> banWords = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        String text = sc.nextLine();
        StringBuilder censoredText = new StringBuilder(text);
        for (String word : banWords
        ) {
            String censored = "*";

            text = text.replace(word, censored.repeat(word.length()));
        }
        System.out.println(text);
    }

}

