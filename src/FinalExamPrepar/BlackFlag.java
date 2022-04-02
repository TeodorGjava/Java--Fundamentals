package FinalExamPrepar;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int daily = Integer.parseInt(sc.nextLine());
        double target = Double.parseDouble(sc.nextLine());
        double collected = 0;
        for (int i = 1; i <=n ; i++) {
            collected+=daily;
            if(i%3==0){
                collected+=daily/2.0;
            } if(i%5==0){
                collected-=collected*0.3;
            }
        }
        if(collected>=target){
            System.out.printf("Ahoy! %.2f plunder gained.", collected);
        }else{
            double percent = collected/target*100;
            System.out.printf("Collected only %.2f%% of the plunder.",percent);
        }
    }
}
