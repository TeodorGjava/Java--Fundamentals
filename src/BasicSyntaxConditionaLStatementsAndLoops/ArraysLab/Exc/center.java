package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class center {
    private static void print(int x1, int x2, int y1, int y2) {
        int sumX = Math.abs(x2)+Math.abs(x1);
        int sumY = Math.abs(y2)+Math.abs(y1);
       if(sumX>sumY){
           System.out.print("("+y1+", "+y2+")");
       }else{
           System.out.println("("+x1+", "+x2+")");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));

    }
}
