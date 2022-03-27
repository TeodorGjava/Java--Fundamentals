package BasicSyntaxConditionaLStatementsAndLoops.DataTypes;

import java.util.Scanner;

public class refactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght, width, height,vol = 0;
        System.out.print("Length: ");
        lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        vol = (lenght * width *height) / 3;
        System.out.printf("Pyramid Volume: %.2f", vol);
    }
    

}
