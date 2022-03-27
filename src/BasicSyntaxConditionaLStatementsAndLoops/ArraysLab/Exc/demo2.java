package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class demo2 {
    static void check(int a,int b, int c){
        int[] arr ={a,b,c};
        int neg = 0;
        int pos = 0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>0){
                pos++;
            }else {
                neg++;
            }
        }
        if(a==0||b==0||c==0){
            System.out.println("zero");
        }
        else if(pos%3==0&&pos!=0|| neg%2==0&neg!=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
    }
}




