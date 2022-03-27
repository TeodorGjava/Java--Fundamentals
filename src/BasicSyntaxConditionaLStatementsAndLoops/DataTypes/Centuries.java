package BasicSyntaxConditionaLStatementsAndLoops.DataTypes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Centuries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = Double.parseDouble(sc.nextLine());
        double y = c*100;
        double d = y*365.2422;
        double h = d*24;
        double m = h *60;
        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",c,y,d,h,m);
    }

}
