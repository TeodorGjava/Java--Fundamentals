package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    //Using the Person class, write a program that reads
    // from the console N lines of personal information and
    // then prints all people whose age is more than 30 years,
    // sorted in alphabetical order.
    //Note: you can use the stream() to filter people.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] data = sc.nextLine().split("\\s+");
            Person person = new Person(data[0],Integer.parseInt(data[1]));
        people.add(person);
        }
            people.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                    .filter(person -> person.getAge() >30)
                    .forEach(p -> System.out.println(p.toString()));
    }
static class Person{
    String name;
    int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
        public String toString() {
            return String .format("%s - %d",this.name,this.age);
        }
    }
    }


