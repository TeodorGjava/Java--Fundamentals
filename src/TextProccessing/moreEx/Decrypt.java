package TextProccessing.moreEx;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String line = sc.nextLine();
        StringBuilder decrypted = new StringBuilder();
        while (!line.equals("find")){
            int j = 0;
            for (int i = 0; i <line.length() ; i++,j++) {
                if(j==arr.length){
                    j=0;
                }
                int ascci = line.charAt(i) - arr[j];
decrypted.append((char)ascci);

            }
            line=sc.nextLine();
        }
        Map<String, String> map = new LinkedHashMap<>();
        String reggexType = "[&](?<type>[A-Za-z]+)[&]";
        String reggexLocation = "[<](?<location>[\\w]+)[>]";
        Pattern patternType = Pattern.compile(reggexType);
        Pattern patternLocation = Pattern.compile(reggexLocation);
        Matcher matcherType = patternType.matcher(decrypted);
        Matcher matcherLocation = patternLocation.matcher(decrypted);
        while(matcherType.find()&&matcherLocation.find()){
            map.put(matcherType.group("type"),matcherLocation.group("location"));
        }
        map.forEach((key,value)->{
            System.out.printf("Found %s at %s%n",key,value);
        });

    }
}
