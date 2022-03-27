package TextProccessing;

import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("File name: "+str.substring(str.lastIndexOf("\\")+1,str.lastIndexOf(".")));
        System.out.println("File extension: "+str.substring(str.lastIndexOf(".")+1));
    }
}
