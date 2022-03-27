package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shelf = Arrays.stream(sc.nextLine()
                .split("&")).collect(Collectors.toList());
        String[] command = sc.nextLine().split("\\s+[|]\\s+");
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "Add Book":
                    if (shelf.contains(command[1])) {
                        break;
                    } else {
                        shelf.add(0, command[1]);
                    }
                    break;
                case "Take Book":
                    shelf.remove(command[1]);
                    break;
                case "Swap Books":
                    String book1= command[1];
                    String book2= command[2];
                    if(!book1.equals(book2)){
                    if (shelf.contains(command[1]) && shelf.contains(command[2])) {
                        int index1 = shelf.indexOf(command[1]);
                        int index2 = shelf.indexOf(command[2]);
                        shelf.remove(command[1]);
                        shelf.remove(command[2]);
                        shelf.add(index1, command[2]);
                        shelf.add(index2, command[1]);
                    }}
                    break;
                case "Insert Book":
                    String book = command[1];
                    if (!shelf.contains(book)) {
                        shelf.add(book);
                    }
                    break;
                case "Check Book":
                    int i = Integer.parseInt(command[1]);
                    if (i < shelf.size()&&i>=0) {
                        System.out.println(shelf.get(i));
                    }
                    break;
            }
            command = sc.nextLine().split("\\s+[|]\\s+");
        }
        for (int i = 0; i <shelf.size() ; i++) {
            if (i == shelf.size() - 1) {
                System.out.print(shelf.get(i));
            } else {
                System.out.print(shelf.get(i) + ", ");
            }
        }
    }
}
