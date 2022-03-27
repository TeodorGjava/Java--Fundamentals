package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class NameSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            int sum =0;
            String name = sc.nextLine();
            for (int j = 0; j <name.length() ; j++) {
                char ch = name.charAt(j);
                switch (ch){
                    case 'a':
                        sum+=(int)ch*name.length();
                        break;case 'A':
                        sum+=(int)ch*name.length();
                        break;
                    case 'o':
                        sum+=ch*name.length();
                        break;case 'O':
                        sum+=ch*name.length();
                        break;
                    case 'e':
                        sum+=ch*name.length();
                        break;case 'E':
                        sum+=ch*name.length();
                        break;
                    case 'u':
                        sum+=ch*name.length();
                        break;case 'U':
                        sum+=ch*name.length();
                        break;
                    case 'i':
                        sum+=ch*name.length();
                        break;case 'I':
                        sum+=ch*name.length();
                        break;
                    default:
                        sum+=ch/name.length();
                }
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        for (int j : arr) System.out.println(j);
    }
}
