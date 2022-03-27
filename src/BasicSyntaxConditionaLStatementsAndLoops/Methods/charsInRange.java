package BasicSyntaxConditionaLStatementsAndLoops.Methods;

import java.util.Scanner;

public class charsInRange {
    private static void printRange(char a, char b){
        int x = a;
        int y = b;
        if(x<y){
        for (int i = a+1; i <b ; i++) {
            char j = (char) (i );
            System.out.print(j + " ");
        }}else{ for (int i = b+1; i <a ; i++) {
            char j = (char) (i);
            System.out.print(j + " ");}
    }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char x = a.charAt(0);
        char y = b.charAt(0);
        printRange(x,y);
    }
}
