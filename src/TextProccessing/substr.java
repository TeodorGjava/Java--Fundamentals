package TextProccessing;

import java.util.Scanner;

public class substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String substring = sc.nextLine();
        String text = sc.nextLine();
        int index = text.indexOf(substring);
        while(index != -1){
            String firstPart = text.substring(0,index);
            String secondPart = text.substring(index + substring.length());
            text = firstPart+secondPart;
            index= text.indexOf(substring);

        }
        System.out.print(text);
    }


}
