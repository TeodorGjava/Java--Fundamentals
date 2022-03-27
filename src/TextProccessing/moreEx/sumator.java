package TextProccessing.moreEx;

import java.util.Scanner;

public class sumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        char from = start.charAt(0);
        String end = sc.nextLine();
        char to = end.charAt(0);
        String line = sc.nextLine();
        int sum = 0;
        for (int i = 0; i <line.length() ; i++) {
            char ch = line.charAt(i);
            if(from > to){
                if(ch >to && ch <from){
                    sum+= ch;
                }
            }else{
                if(ch>from&& ch < to){
                    sum+=ch;
                }
            }
        }
        System.out.println(sum);
    }//46 -64
    //49 + 50 + 53 + 54 + 53 + 51 + 53
}
