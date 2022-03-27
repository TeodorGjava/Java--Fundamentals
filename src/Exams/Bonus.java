package Exams;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine());
        int lectures = Integer.parseInt(sc.nextLine());
        int addBonus = Integer.parseInt(sc.nextLine());

        double topStudent=0;
        double topBonus= 0;
        for (int i = 0; i <students ; i++) {
            int attend = Integer.parseInt(sc.nextLine());
            double totalBonus = attend*1.0/lectures*(5+addBonus);
            if(topStudent<attend&&topBonus<totalBonus){
                topStudent=attend;
                topBonus=Math.ceil(totalBonus);
            }
        }
        System.out.printf("Max Bonus: %.0f.\n", topBonus);
        System.out.printf("The student has attended %.0f lectures.", topStudent);
    }
}
