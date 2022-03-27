package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseArrString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stream<String> arr = Arrays.stream(sc.nextLine().split(" "));
        String[] arrr= (String[]) arr.toArray();
        for (int i = arrr.length-1; i >=0 ; i--) {
            System.out.println(arrr[i]+" ");
        }
    }
}
