package Exams.Prepare;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootFTW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();
        int targets = 0;
        while (!command.equals("End")) {
            int shot = Integer.parseInt(command);
            if (shot < arr.size()) {
                for (int i = 0; i < arr.size(); i++) {
                        for (int j = 0; j < arr.size(); j++) {
                            if (arr.get(i) < arr.get(j)) {
                                arr.set(j, arr.get(j) - arr.get(i));
                            } else if (arr.get(i) >= arr.get(j)) {
                                arr.set(j, arr.get(j) + arr.get(i));
                            }
                        }
                    arr.set(i, -1);
                    targets++;
                    }


            }
            command = sc.nextLine();
        }
        String field = "";
        for (int i = 0; i <arr.size() ; i++) {
            field+=arr.get(i)+" ";
        }
        System.out.printf("Shot targets %d -> %s ",targets,field);

    }



}

