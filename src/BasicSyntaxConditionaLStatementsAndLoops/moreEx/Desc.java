package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.lang.reflect.Array;
import java.util.*;

public class Desc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }

    }
}
