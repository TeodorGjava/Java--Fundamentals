package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyRoster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] employee = sc.nextLine().split(" ");
            if(employee.length==4){
                Employee emp = new Employee(employee[0],Double.parseDouble(employee[1]),employee[2],employee[3]);
            }if(employee.length==5){
                Employee emp = new Employee(employee[0],Double.parseDouble(employee[1]),employee[2],employee[3],employee[4]);
            }if(employee.length==6){
                Employee emp = new Employee(employee[0],Double.parseDouble(employee[1]),employee[2],employee[3],employee[4],Integer.parseInt(employee[5]));
                employeeList.add(emp);
            }
        }

    }
    static class Employee{
        String name;
        double salary;

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getPosition() {
            return position;
        }

        public String getDepartment() {
            return department;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        String position;
        String department;
        String email;
        int age;


        public Employee(String name, double salary, String position, String department){
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
        }public Employee(String name, double salary, String position, String department,String email){
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email=email;
        }
        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }
    }
}
