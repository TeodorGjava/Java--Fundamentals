package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        List<Integer> state = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int i = 0;
        for (int x : state) {
            if (i == state.size()) {
                break;
            }
            if (people < 4) {
                state.set(i, people);
                people -= people;
                break;
            }
            int a = 4 - x;
            state.set(i, state.get(i) + a);
            people -= a;
            i++;
        }
        boolean exactFull = state.size() * 4 == people;
        if (people > 0) {
            System.out.println("There isn't enough space! " + people + " people in a queue!");
            print(state);
        }
        if (exactFull && people == 0) {
            print(state);
        }
        if (people==0&&!exactFull)
         {
            System.out.println("The lift has empty spots!");
            print(state);

        }
    }

    private static void print(List<Integer> state) {
        for (int s:state
             ) {
            System.out.print(s+" ");
        }
    }

}
