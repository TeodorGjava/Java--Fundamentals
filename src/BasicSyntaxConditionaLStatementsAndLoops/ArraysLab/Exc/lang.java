package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class lang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abr = sc.nextLine();
        if(abr.equals("England")||abr.equals("USA")){
            System.out.println("English");
        }else if(abr.equals("Spain")||abr.equals("Mexico")||abr.equals("Argentina")){
            System.out.println("Spanish");
        }else{
            System.out.println("unknown");
        }
    }
}
