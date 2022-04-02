package FinalExamPrepar;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidBarcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("^@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+$");
        for (int i = 0; i < n; i++) {
            String entry = sc.nextLine();
            Matcher matcher = pattern.matcher(entry);
            if (matcher.find()) {
                if (matcher.matches()) {
                    StringBuilder group = new StringBuilder();
                    for (int j = 0; j < matcher.group().length(); j++) {
                        if (matcher.group().charAt(j) >= 48 && matcher.group().charAt(j) <= 57) {
                            group.append((matcher.group().charAt(j)));
                        }
                    }
                    if (!group.toString().equals("")) {
                        System.out.println("Product group: " + group);
                    } else {
                        System.out.println("Product group: 00");
                    }

                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
