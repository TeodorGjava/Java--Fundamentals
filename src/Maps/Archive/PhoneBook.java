package Maps.Archive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Map<String , String> phoneBook = new TreeMap<>();
        while (!line.equals("END")){
            String[] input = line.split("\\s+");
            String command = input[0];
            if(command.equals("A")){
               String name = input[1];
               String number =input[2];
               if(!phoneBook.containsKey(name)){
                   phoneBook.put(name,number);
               }else{
                   phoneBook.put(name,number);
               }
            }
            if(command.equals("S")){
                String name = input[1];
                if(phoneBook.containsKey(name)){
                    System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }
            if(command.equals("ListAll")){
                phoneBook.entrySet().stream().forEach((x)-> System.out.println(x.getKey() +" -> "+x.getValue()));
            }
            line=sc.nextLine();
        }
    }
}
