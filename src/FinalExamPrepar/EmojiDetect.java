package FinalExamPrepar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("([*:]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Pattern coolPattern = Pattern.compile("(?<cool>[\\d])");
        List<String> emojis = new ArrayList<>();
        List<String> fullText = new ArrayList<>();
        int coolNumber = 1;
        Matcher matcher = pattern.matcher(input);
        Matcher cool = coolPattern.matcher(input);
        while (matcher.find()){
            String emoji = matcher.group("emoji");
            String full = matcher.group();
            emojis.add(emoji);
            fullText.add(full);
        }
        while (cool.find()){
            coolNumber*= Integer.parseInt(cool.group("cool"));
        }
        System.out.println("Cool threshold: "+ coolNumber);
        System.out.println(emojis.size() +" emojis found in the text. The cool ones are:");
        for (int i = 0; i <emojis.size() ; i++) {
            int sum = 0;
            for (int j = 0; j <emojis.get(i).length() ; j++) {
                char ch = emojis.get(i).charAt(j);
                sum+=ch;
            }
            if(sum<coolNumber){
                fullText.remove(emojis.get(i));
            }else{
                System.out.println(fullText.get(i));
            }
        }


    }
}
