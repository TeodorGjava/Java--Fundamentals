package FinalExamPrepar;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder msg = new StringBuilder(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("Reveal")) {
            String[] line = command.split(":[|]:");
            String action = line[0];
            switch (action) {
                case "InsertSpace":
                    insertSpace(msg, Integer.parseInt(line[1]));
                    break;
                case "Reverse":
                    reverse(msg,line[1]);
                    break;
                case "ChangeAll":
                    changeAll(msg,line[1],line[2]);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println("You have a new text message: "+ msg.toString());
    }

    private static void changeAll(StringBuilder msg, String sub, String replacement) {
        String thing = msg.toString().replaceAll(sub,replacement);
        msg.setLength(0);
        msg.append(thing);
        System.out.println(msg);
    }

    private static void reverse(StringBuilder msg, String substring) {
        String thing = msg.toString();
        if(thing.contains(substring)){
            StringBuilder str = new StringBuilder(substring);
            str.reverse();
            msg.delete(msg.indexOf(substring),msg.indexOf(substring)+substring.length());
            msg.append(str);
            System.out.println(msg);;
        }else{
            System.out.println("error");
        }
    }

    private static void insertSpace(StringBuilder msg, int index) {
        msg.insert(index," ");
        System.out.println(msg);
    }
}
