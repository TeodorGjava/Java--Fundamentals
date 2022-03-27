package DataTypesAndVariables.moreEx;

import java.util.Scanner;

public class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean isOpened = false;
        boolean balanced = true;
        for (int i = 0; i <n ; i++) {
            String input = sc.nextLine();
            if (input.equals("(")){
                if(!isOpened){
                    isOpened = true;
                }else {
                    balanced=false;
                }
            }
            if (input.equals(")")){
                if(isOpened){
                    isOpened=false;

                }else {
                    balanced=false;
                }
            }
        }
        if (!isOpened&&balanced){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
