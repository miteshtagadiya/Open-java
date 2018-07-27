package Salary;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firtsname,lastname;
        int ssn;
        double hours;
        double wages;

        System.out.println("Enter FirstName: ");
        firtsname = sc.next();
        System.out.println("Enter LastName: ");
        lastname = sc.next();
        System.out.println("Enter SSN: ");
        ssn = sc.nextInt();
        System.out.println("Enter Hours: ");
        hours = sc.nextDouble();
        System.out.println("Enter Wages: ");
        wages = sc.nextDouble();

        HourlyEmployee he = new HourlyEmployee(firtsname,lastname,ssn,hours,wages);

        System.out.println(he.toString());
    }
}
