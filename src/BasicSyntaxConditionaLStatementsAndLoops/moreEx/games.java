package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = Double.parseDouble(sc.nextLine());
        String command = sc.nextLine();
        double total = 0;
        while (!command.equals("Game Time") || balance == 0) {
            switch (command) {
                case "OutFall 4":

                    if (balance>=39.99){
                        balance -= 39.99;
                        total +=39.99;
                        System.out.println("Bought OutFall 4");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":

                    if (balance>=15.99){
                        balance -= 15.99;
                        total +=15.99;
                        System.out.println("Bought CS: OG");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance>=19.99){
                        balance -= 19.99;
                        total +=19.99;
                        System.out.println("Bought Zplinter Zell");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (balance>=59.99){
                        balance -= 59.99;
                        total +=59.99;
                        System.out.println("Bought Honored 2");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (balance>=29.99){
                        balance -= 29.99;
                        total +=29.99;
                        System.out.println("Bought RoverWatch");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance>=39.99){
                        balance -= 39.99;
                        total +=39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command= sc.nextLine();
        }
        if (command.equals("Game Time")){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", total, balance);
        }if(balance==0){
            System.out.println("Out of mo-ney!");
    }}
}
