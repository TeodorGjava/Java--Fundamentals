package Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexName = "(?<name>[A-Za-z]+)";
        String regexKm = "(?<km>[\\d])";
        List<String> participants = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> finalList = new LinkedHashMap<>();
        for (String name : participants
        ) {
            finalList.putIfAbsent(name, 0);
        }
        Pattern name = Pattern.compile(regexName);
        Pattern dist = Pattern.compile(regexKm);

        String line = sc.nextLine();
        while (!line.equals("end of race")) {
            Matcher nameMatcher = name.matcher(line);
            StringBuilder sb = new StringBuilder();
            StringBuilder diss = new StringBuilder();
            int kms = 0;
            Matcher distanceMatch = dist.matcher(line);
            while (nameMatcher.find()) {
               sb.append(nameMatcher.group("name"));
               while(distanceMatch.find()) {
                   kms += Integer.parseInt(distanceMatch.group("km"));
               }
            }
            if(finalList.containsKey(sb.toString())){
                finalList.replace(sb.toString(),finalList.get(sb.toString())+kms);
            }
            sb.setLength(0);
            line = sc.nextLine();
        }

      List<String> score = finalList.entrySet().stream().sorted((s,x)->Integer.compare(x.getValue(),s.getValue())).map(s->s.getKey()).collect(Collectors.toList());
        for (int i = 0; i <score.size() ; i++) {
            if(i==3){
                break;
            }
            if(i == 0){
            System.out.printf("%dst place: %s\n", i+1,score.get(i));}else if(i == 1){
            System.out.printf("%dnd place: %s\n", i+1,score.get(i));}else{
            System.out.printf("%drd place: %s", i+1,score.get(i));}
        }
    }
}
