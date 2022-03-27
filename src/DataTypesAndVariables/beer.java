package DataTypesAndVariables;

import java.util.Scanner;

public class beer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String maxKeg= "";
        double maxVol = 0;
        for (int i = 0; i < n; i++) {
            String model = sc.nextLine();
            double r = Double.parseDouble(sc.nextLine());
            int h = Integer.parseInt(sc.nextLine());
            double sum = Math.PI *Math.pow(r,2)*h;
            if(sum>maxVol){
                maxVol= sum;
                maxKeg=model;
            }
        }
        System.out.println(maxKeg);
    }
}
