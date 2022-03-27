package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    private static void MaxSequence(String s){
    int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    int count = 0;
    int longest = 0;
    String sequence = String.valueOf(arr[0]);
    int index = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
        if(arr[i]==arr[i+1]){
            count++;
            if(count>longest){
                longest=count;
                index=i;
                sequence= String.join(" ",String.valueOf(arr[i]+" "));
            }
        }else {
            count=0;
        }

    }

        for (int i = 0; i <=longest ; i++) {
        System.out.print(sequence);
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxSequence(sc.nextLine());
    }
}

