package ObjectsAndClasses;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teamwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Team t = new Team();

            String user = line[0];
            String team = line[1];
            if(teamList.contains(team)) {
                System.out.println("Team "+ team+ " was already created!");
                break;
            }
            if(teamList.contains(user)){
                System.out.println(user+ " cannot create another team!");
                break;
            }
            System.out.printf("Team %s has been created by %s!%n",team,user);
            teamList.add(t);
            String[] command = sc.nextLine().split("->");
            while (!command[0].equals("end")){


                command = sc.nextLine().split("->");
            }
        }
    }

    public static class Team {
        String user;
        String team;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }


    }
}
