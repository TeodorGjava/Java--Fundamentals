package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class Time30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputh = Integer.parseInt(sc.nextLine());
        int inputm = Integer.parseInt(sc.nextLine());
        if(inputm+30<60){
            if(inputm<10){
                System.out.printf("%s:0%s",inputh,inputm+30);
            }else {
                System.out.printf("%s:%s",inputh,inputm+30);
            }
        }else if(inputm+30>60){
            inputm = inputm +30 - 60;
            inputh++;
            if(inputh>23){
                inputh=0;
                if(inputm<10){
                    System.out.printf("%s:0%s",inputh,inputm);
                }else {
                    System.out.printf("%s:%s",inputh,inputm);
                }
            }else{
            if(inputm<10){
                System.out.printf("%s:0%s",inputh,inputm);
            }else{
                System.out.printf("%s:%s",inputh,inputm);
            }
        }}
    }}
