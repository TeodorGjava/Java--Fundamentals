package TextProccessing.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        List<Double> dblist = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <input.length ; i++) {
            str.append(input[i]);
            char ch = input[i].charAt(0);
            char ch2 = input[i].charAt(input.length-1);
            double num =Double.parseDouble(input[i].substring(0,input[i].length()-1));
            if(Character.isUpperCase(ch)){
                dblist.add(num / ch - 100);
            }else{
                dblist.add(num * ch - 140);
            }
            if(Character.isUpperCase(ch2)){
             //   result-= ch-100;
            }else{
          //      result += ch + 140;
            }
        }
    }
}
