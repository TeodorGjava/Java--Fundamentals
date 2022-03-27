package TextProccessing.moreEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    public static void main(String[] args) {
        Map<String, Integer> people = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String regexName = "[@](?<name>[A-Za-z]+)[|]";
        String regexAge = "(?<age>[\\d]+)";
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Pattern pattName = Pattern.compile(regexName);
            Pattern pattAge = Pattern.compile(regexAge);
            Matcher matchName = pattName.matcher(line);
            Matcher matchAge = pattAge.matcher(line);
            while (matchName.find() && matchAge.find()) {
                String name = matchName.group("name");
                int age = Integer.parseInt(matchAge.group("age"));
                people.put(name,age);
            }
        }
        for (Map.Entry<String, Integer>entry:people.entrySet()
             ) {
            System.out.printf("%s is %d years old.%n",entry.getKey(),entry.getValue());
        }
    }
}
