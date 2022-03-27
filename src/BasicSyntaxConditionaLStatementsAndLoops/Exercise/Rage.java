package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Rage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*•	On the first input line - lost games count – integer in the range [0, 1000].
•	On the second line – headset price - the floating-point number in the range [0, 1000]. 
•	On the third line – mouse price - the floating-point number in the range [0, 1000]. 
•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000]. 
•	On the fifth line – display price - the floating-point number in the range [0, 1000]. 

        * */
        double loses = Double.parseDouble(sc.nextLine());
        double headset = Double.parseDouble(sc.nextLine());
        double mouseprice = Double.parseDouble(sc.nextLine());
        double keyboardprice = Double.parseDouble(sc.nextLine());
        double displayprice = Double.parseDouble(sc.nextLine());
        double keybourd= 0;
        double exp = 0;
        for (int i = 1; i <=loses ; i++) {

            if(i%2==0){
                exp +=headset;
            }
            if(i%3==0){
                exp +=mouseprice;
            }
            if (i%2==0&&i%3==0){
                exp += keyboardprice;
                keybourd++;
                if (keybourd%2==0){
                    exp += displayprice;
                }
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", exp );
    
    
    }
}
