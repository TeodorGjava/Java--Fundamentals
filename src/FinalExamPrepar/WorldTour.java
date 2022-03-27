package FinalExamPrepar;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder destinations = new StringBuilder(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("Travel")) {
            String[] line = command.split(":");
            if (line.length > 2)
                switch (line[0]) {
                    case "Add Stop":
                        addStop(destinations, Integer.parseInt(line[1]), line[2]);

                        break;
                    case "Remove Stop":
                        removeStop(destinations, Integer.parseInt(line[1]), Integer.parseInt(line[2]));

                        break;
                    case "Switch":
                        switchStop(destinations, line[1], line[2]);
                        break;
                }
            command = sc.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + destinations);

    }

    private static void switchStop(StringBuilder destinations, String oldString, String newString) {
        String check = destinations.toString();
        while(check.contains(oldString)){
            destinations.replace(destinations.indexOf(oldString),destinations.indexOf(oldString)+oldString.length(),newString);
            check=check.substring(check.indexOf(oldString)+oldString.length(),check.length()-1);
        }
        System.out.println(destinations);
    }

    private static void removeStop(StringBuilder destinations, int start, int end) {
        if (start < destinations.length() && end < destinations.length()) {
            destinations.replace(start, end + 1, "");
        }
        System.out.println(destinations);
    }

    private static void addStop(StringBuilder destinations, int index, String stop) {
        if (index < destinations.length()) {
            destinations.insert(index, stop);
        }
        System.out.println(destinations);

    }
}
