package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            String first =  arr[i];
            for (int j = 0; j <arr.length-1 ; j++) {
                arr[j]= arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println(String.join(" ",arr));
    }
}
