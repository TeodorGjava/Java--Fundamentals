package TextProccessing;

import java.util.Scanner;

public class explosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        int pow = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(pow>0&& str.charAt(i)!='>'){
                str.deleteCharAt(i);
                i--;

            }else if(str.charAt(i)=='>'){
                pow+= Integer.parseInt(String.valueOf(str.charAt(i+1)));
            }
        }
        System.out.println(str);
    }
}
