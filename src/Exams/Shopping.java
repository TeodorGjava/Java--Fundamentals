package Exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("!");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        String command = sc.nextLine();
        String[] arr2 = command.split(" ");
        while (!command.equals("Go Shopping!")) {
            switch (arr2[0]) {
                case "Urgent":
                    for (int i = 0; i < arr.length; i++) {
                        if (arr2[1].equals(arr[i])) {
                            list.set(0, arr2[1]);
                            break;
                        }
                    }

                case "Unnecessary":
                    for (int i = 0; i < list.size(); i++) {
                        if (arr2[1].equals(arr[i])) {
                            list.remove(arr[1]);
                            break;
                        }
                    }
                case "Correct":
                    for (int i = 0; i < arr.length; i++) {
                        if (arr2[1].equals(arr[i])) {
                            list.set(i, arr[2]);
                            break;
                        }
                    }
                case "Rearrange":
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[1].equals(list.get(i))) {
                            list.remove(list.size() - 1);
                            break;
                        }
                    }
            }
            command = sc.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
