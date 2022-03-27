package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentList.add(student);
        }
        studentList.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }

    static class Student {
        String fname;
        String lname;

        public String getFname() {
            return fname;
        }

        public String getLname() {
            return lname;
        }

        public double getGrade() {
            return grade;
        }

        double grade;

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", fname, lname, grade);
        }

        public Student(String fname, String lname, double grade) {
            this.fname = fname;
            this.lname = lname;
            this.grade = grade;
        }
    }
}
