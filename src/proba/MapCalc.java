package proba;

import java.util.*;

public class MapCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        method(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
    }

    private static void method(double litri,double quantity,double humility ) {
        Map<String, List<Double>> pqsak1 = new HashMap<>();

        pqsak1.put("Пясък 1: ",new ArrayList<>());
        pqsak1.get("Пясък 1: ").add(quantity);
        pqsak1.get("Пясък 1: ").add(humility);

        for (Map.Entry<String, List<Double>>entry: pqsak1.entrySet()
             ) {
            System.out.println(humility);
            System.out.printf("%s %.3f%n",entry.getKey(),(entry.getValue().get(0)+(entry.getValue().get(0)*entry.getValue().get(1)/100))*litri/1000);
            System.out.println("Вода през влага: "+ entry.getValue().get(0)*0.05);
        }
    }
}
