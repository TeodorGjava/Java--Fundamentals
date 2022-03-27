package FinalExamPrepar;

import java.util.*;

public class HeroesOfCode {
    static class Hero {
        String name;
        int HP;
        int MP;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHP() {
            return HP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public int getMP() {
            return MP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }

        public Hero(String name, int HP, int MP) {
            this.name = name;
            this.HP = HP;
            this.MP = MP;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Hero> heroes = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] heroPar = line.split(" ");
            Hero hero = new Hero(heroPar[0], Integer.parseInt(heroPar[1]), Integer.parseInt(heroPar[2]));
            heroes.put(hero.getName(),hero);
        }
        String command = sc.nextLine();
        while (!command.equals("End")) {
            String[] line = command.split(" - ");
            String name = line[0];
            switch (name) {
                case "CastSpell":
                    castSpell(heroes,line[1],Integer.parseInt(line[2]),line[3]);
                    break;
                case "TakeDamage":
                    takeDmg(heroes,line[1],Integer.parseInt(line[2]),line[3]);
                    break;
                case "Recharge":
                    recharge(heroes,line[1],Integer.parseInt(line[2]));
                    break;
                case "Heal":
                    heal(heroes,line[1],Integer.parseInt(line[2]));
                    break;
                default:
                    throw new IllegalStateException("Unknown command name ");
            }
            command = sc.nextLine();
        }
        for (Hero hero : heroes.values()
        ) {
            System.out.println(hero.getName() + System.lineSeparator()
                    + "  HP: " + hero.getHP() + System.lineSeparator() +
                    "  MP: " + hero.getMP());
        }
    }

    private static void castSpell(Map<String,Hero> heroes, String name, int mp, String spell) {
        Hero hero = heroes.get(name);
        if(hero.getMP()>=mp){
            hero.setMP(hero.getMP()-mp);
            System.out.println(hero.getName()+ " has successfully cast "+spell+" and now has "+hero.getMP()+" MP!");
        }else{
            System.out.println(hero.getName()+" does not have enough MP to cast " + spell +"!");
        }
    }

    private static void takeDmg(Map<String,Hero> heroes,String name, int dmg, String attacker) {
        Hero hero = heroes.get(name);
        hero.setHP(hero.getHP()-dmg);
        if(hero.getHP()>0){
            System.out.println(hero.getName()+" was hit for "+dmg+" HP by "+attacker+ " and now has "+hero.getHP()+" HP left!");
        }else{
            System.out.println(hero.getName()+" has been killed by " +attacker+"!");
        heroes.remove(name);
        }
    }

    private static void recharge(Map<String,Hero> heroes,String name, int amount) {
            Hero hero = heroes.get(name);
            int oldMp = hero.getMP();
            int newMP = Math.min(hero.getMP()+amount,200);
            hero.setMP(newMP);
        System.out.println(hero.getName()+" recharged for "+(newMP-oldMp)+" MP!");
    }

    private static void heal(Map<String,Hero> heroes,String name, int amount) {
        Hero hero = heroes.get(name);
        int oldHp = hero.getHP();
        int newHP = Math.min(hero.getHP()+amount,100);
        hero.setHP(newHP);
        System.out.println(hero.getName()+" healed for "+(newHP-oldHp)+" HP!");


    }
}
