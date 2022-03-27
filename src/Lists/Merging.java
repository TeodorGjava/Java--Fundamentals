package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        int count=1;
        if(list1.size()>list2.size()){
            while(list2.size()>0) {
                mergedList.add(count,list1.get(0));
                mergedList.add(count+1,list2.get(0));
                list1.remove(0);
                list2.remove(0);
                count++;
            }
            for (int i = 0; i <list1.size() ; i++) {
                mergedList.add(list1.get(i));
            }
        }else{
            while(list1.size()>0) {
                mergedList.add(count,list1.get(0));
                mergedList.add(count+1,list2.get(0));
                list1.remove(0);
                list2.remove(0);
                count++;}
            for (int i = 0; i <list2.size() ; i++) {
                mergedList.add(list2.get(i));
            }
        }
        for (Integer x:mergedList
             ) {
            System.out.print(x+" ");
        }
        
    }
}
