package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class shit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String winner = "";
        int current=0;
        for(String comand = sc.nextLine();!comand.equals("Clone them!");comand=sc.nextLine()){
            int[] nums = Arrays.stream(comand.split("!")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int i = 0; i <nums.length ; i++) {
                sum+=nums[i];
            }
            if(sum>current){
                current=sum;
            }

        }
        for (int i = 0; i <current ; i++) {

        }




            }
        }
