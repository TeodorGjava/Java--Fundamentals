package Maps;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> companies = new LinkedHashMap<>();
        List<String> employees = new ArrayList<>();
        String[] command = sc.nextLine().split(" -> ");
        while (!command[0].equals("End")) {
            String company = command[0];
            String id = command[1];
            if (!companies.containsKey(company)) {
                employees.add(id);
                companies.put(company, new ArrayList<>());
                companies.get(company).add(id);
                if (!employees.contains(id)) {
                    companies.get(company).add(id);
                    companies.remove(id);
                }
            } else {
                if (!employees.contains(id)) {
                    companies.get(company).add(id);
                }
            }
            command = sc.nextLine().split(" -> ");
        }
        for (Map.Entry<String, List<String>> entry : companies.entrySet()
        ) {
            if(!entry.getValue().isEmpty()){
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().forEach(p -> System.out.printf("-- %s%n", p));
        }}
    }


}
