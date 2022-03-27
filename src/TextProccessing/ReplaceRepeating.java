package TextProccessing;

import java.util.Scanner;

public class ReplaceRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            if(i!=input.length()-1){
            if(input.charAt(i)!=input.charAt(i+1)){
                str.insert(0,input.charAt(i));
            }
        }
            else{
                str.insert(0,input.charAt(i));
            }}
        System.out.println(str.reverse());
        }
    }

