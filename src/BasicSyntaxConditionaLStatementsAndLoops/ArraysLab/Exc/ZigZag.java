package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] firstArray =  new String[n];
        String[] secArr= new String[n];
        for (int i = 1; i <=n ; i++) {
            String[] arr = sc.nextLine().split(" ");
                if(i%2==0){
                    firstArray[i-1]=arr[0];
                    secArr [i-1]= arr[1];
                }else{
                    firstArray[i-1]=arr[1];
                    secArr [i-1]= arr[0];
                }
        }
        for (String s : secArr) {

            System.out.print(s+" ");
        }
        System.out.println();
        for (String s : firstArray) {

            System.out.print(s+" ");
        }
    }
}
