package Exams.Prepare.Finals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        List<Integer> spots = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int i = 0;
        while (people > 0) {
if(i== spots.size()-1){
    break;
}
            if (people + spots.get(i) < 4) {
                spots.set(i, people);
                people -= people;
            } else {
                int a = 4 - spots.get(i);
                if (a > 0) {
                    spots.set(i, 4);
                    people -= a;
                }
            }
            i++;
        }

        if (spots.get(spots.size() - 1) < 4) {
            System.out.printf("The lift has empty spots!\n");
            for (int j : spots) {
                System.out.print(j + " ");
            }
        } else if (spots.get(spots.size() - 1) == 4 && people == 0) {
            for (int j : spots) {
                System.out.print(j + " ");
            }
        } else if (spots.get(spots.size() - 1) == 4 && people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
            for (int j : spots) {
                System.out.print(j + " ");
            }
        }
    }
}
