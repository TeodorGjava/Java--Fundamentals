package TextProccessing.lab;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(line);
        int strength = 0;
        for (int i = 0; i <stringBuilder.length() ; i++) {
            if(strength>0&&stringBuilder.charAt(i)!='>'){
                stringBuilder.deleteCharAt(i);
                strength--;
                i--;
            }else if(stringBuilder.charAt(i)== '>'){
                strength+= Integer.parseInt(String.valueOf(stringBuilder.charAt(i+1)));
            }
        }
        System.out.println(stringBuilder);



    }
}
