package Exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int bigger = 0;
        double avg = 0;
        for (int j : arr) {
            avg += j;
        }
        avg /= arr.length;
        for (int j : arr) {
            if (avg < j) {
                bigger++;
                arrayList.add(j);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        if (arrayList.size() > 5) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayList.get(j) + " ");
            }
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");

            }
            if (arr.length == 1 || arr[0] == arr[1]) {
                System.out.println("No");
            }
        }
    }

}
