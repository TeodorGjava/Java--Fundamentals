package MidExam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coffees = Arrays.stream(sc.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
           List<String> command = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
            String command1 = command.get(0);
           if(!command1.equals("")){
            switch (command1) {
                case "Include":
                    if(command.size()==2){
                    coffees.add(command.get(1));}
                    break;
                case "Remove":
                    if(command.size()==3){
                    int numCoffees = Integer.parseInt(command.get(2));
                    int minus = coffees.size()-numCoffees;
                    if (numCoffees <=coffees.size()) {
                        switch (command.get(1)) {
                            case "first":
                                while(coffees.size()>minus){
                                    coffees.remove(0);
                                }
                                break;
                            case "last":
                                while(coffees.size()>minus){
                                    coffees.remove(coffees.size() - 1);
                                }
                                break;
                        }}
                    }
                    break;
                case "Prefer":
                    if(command.size()==3){
                    String coffee1 = coffees.get(Integer.parseInt(command.get(1)));
                    String coffee2 = coffees.get(Integer.parseInt(command.get(2)));
                    int first = Integer.parseInt(command.get(1));
                    int second = Integer.parseInt(command.get(2));
                    if (coffees.contains(coffee1) && coffees.contains(coffee2)){
                            if (first >= 0 && first<coffees.size()&& second >= 0&& second<coffees.size()){
                           coffees.set(first, coffee2);
                           coffees.set(second,coffee1);
                            /*if (index1 > index2) {
                                coffees.remove(Integer.parseInt(command[1]));
                                coffees.remove(Integer.parseInt(command[2]));
                                coffees.add(index2, coffee1);
                                coffees.add(index1, coffee2);
                            } else {
                                coffees.remove(Integer.parseInt(command[2]));
                                coffees.remove(Integer.parseInt(command[1]));
                                coffees.add(index1, coffee2);
                                coffees.add(index2, coffee1);
                            }*/
                        }
                    }}
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
            }
        }}
        System.out.println("Coffees:");
        System.out.println(String.join(" ",coffees));
        }
    }

