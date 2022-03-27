package TextProccessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.stream(sc.nextLine().split("[|]")).collect(Collectors.toList());
        List<String> line = new ArrayList<>();
        List<String> treti = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.size(); i++) {
            line.addAll(List.of(input.get(input.size() - 1 - i).split("\\s+")));

        }
        for (int i = 0; i <line.size() ; i++) {
            treti.addAll(List.of(line.get(line.size()-1-i).split("\\s")));
        }


        for (String s : line
        ) {
            if (s.equals(" ")) {

            } else {
                str.append(s + " ");
            }
        }
        String x = str.toString();
        x.replaceAll("\\s+","");
        System.out.println(x);

    }
}
