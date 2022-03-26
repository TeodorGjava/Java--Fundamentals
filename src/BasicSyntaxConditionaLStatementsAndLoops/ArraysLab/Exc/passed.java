package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class passed {
    Scanner sc = new Scanner(System.in);
    passed(){
        double grade = Double.parseDouble(sc.nextLine());
        if (grade>=3.00){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }

    public static void main(String[] args) {
        new passed();
    }
}
