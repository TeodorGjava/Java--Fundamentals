package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.util.Arrays;
import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getString(arr));

       // double len1= lineLen();
        double len2= lineLen(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));


       // if(len1>len2){

   // }else{

    //}
    }
    static String getString(int[] arr){
        String string ="";
        for (int i = 0; i <arr.length ; i++) {
            string+=arr[i]+" ";
        }
        return string;
    }
    static double lineLen(double x1,double y1, double x2,double y2){
        double lineLen= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return lineLen;
    }
}
