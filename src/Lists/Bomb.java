package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] arr = Arrays.stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int bomb = arr[0];
        int pow = arr[1];
        while (list.contains(bomb)) {
            int index = list.indexOf(bomb);
            int start = index - pow;
            int end = index + pow;
            if (start < 0) {
                start = 0;
            }
            if (end >= list.size()) {
                end = list.size() - 1;
            }
            for (int i = start; i < end; i++) {
                list.remove(start);
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            sum+= list.get(i);
        }
        System.out.println(sum);
    }
}
