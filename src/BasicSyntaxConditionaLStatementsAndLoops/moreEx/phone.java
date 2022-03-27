package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String msg = "";
        for (int i = 0; i <n ; i++) {
        String digits = sc.nextLine();
        int diglen= digits.length();
        char onedig= digits.charAt(0);
        int mainDig = Character.getNumericValue(onedig);
        int offset = (mainDig-2)*3;
        if (mainDig==8||mainDig==9){
            offset = (mainDig -2)*3 +1;
        }
        int letter = offset +diglen -1;
        int lettercode = letter+97;
            char let = (char) lettercode;
            if (mainDig ==0 ){
                let = (char)(mainDig+32);
            }
            msg+=let;
        }
        System.out.println(msg);

        }
    }

