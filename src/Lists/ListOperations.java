package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbslist = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = sc.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Add":
                    numbslist.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) < numbslist.size() ) {
                        numbslist.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                        break;
                    } else {
                        System.out.println("Invalid index");
                    }
                case "Shift":
                    switch (command[1]) {
                        case "left":
                            for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                                numbslist.add(numbslist.get(0));
                                numbslist.remove(numbslist.get(0));
                            }
                            break;
                        case "right":
                            for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                                numbslist.add(0, numbslist.get(numbslist.size()-1));
                                numbslist.remove(numbslist.size() - 1);
                            }

                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) < numbslist.size() ) {
                        numbslist.remove(numbslist.get(Integer.parseInt(command[1])));
                        break;
                    } else {
                        System.out.println("Invalid index");
                    }
            }
            command = sc.nextLine().split("\\s+");
        }
        for (Integer x: numbslist
             ) {
            System.out.print(x+" ");
        }
    }
}
