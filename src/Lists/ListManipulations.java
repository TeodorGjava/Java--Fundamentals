package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers =
                (Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        while (true){
        String line = sc.nextLine();
        if (line.equals("end")){
            break;
        }
        String[] tokens = line.split(" ");
        switch (tokens[0]){
            case "Add":
                int numToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numToAdd);
                break;
            case "Remove":
                int numToRemove = Integer.parseInt(tokens[1]);
                numbers.remove(numToRemove);
                break;
            case "RemoveAt":
                int removeAt = Integer.parseInt(tokens[1]);
                numbers.remove(removeAt);
                break;
            case "Insert":
                int numToInsert = Integer.parseInt(tokens[1]);
                int indexToInsert = Integer.parseInt(tokens[2]);
                numbers.add(indexToInsert,numToInsert);
                break;
        }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
