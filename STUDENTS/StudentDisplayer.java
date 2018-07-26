package STUDENTS;

import java.util.Scanner;

public class StudentDisplayer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        int studentId;
        String name,major,level;
        int status;
        boolean sts;
        System.out.println("Please Enter the Input Either 1 Or 2");
        System.out.println("1. Undergraduate");
        System.out.println("2. Graduate");
        int ug1 = sc.nextInt();

        if(ug1 == 1){
            System.out.println("Enter Student Id");
            studentId = sc.nextInt();
            if(studentId<0){
            do{
                System.out.println("Enter Student Id");
                studentId = sc.nextInt();
            }while(studentId>0);}

            System.out.println("Enter Student FullName");
            name = sc.next();
            if(name == ""){
            do{
                System.out.println("Enter Student FullName");
                name = sc.next();
            }while(name != ""); }

            do{
                System.out.println("Enter Major");
                major = sc.next();
            }while(major == "freshman" || major == "sophomore" || major == "junior" || major == "senior");

            System.out.println("Enter UnderGraduate Level");
            level = sc.next();

            Undergraduate ug = new Undergraduate(studentId,name,major,level);
            ug.displayStudentData();

        }else{
            System.out.println("Enter Student Id");
            studentId = sc.nextInt();
            if(studentId<0){
                do{
                    System.out.println("Enter Student Id");
                    studentId = sc.nextInt();
                }while(studentId>0);}

            System.out.println("Enter Student FullName");
            name = sc.next();
            if(name == ""){
                do{
                    System.out.println("Enter Student FullName");
                    name = sc.next();
                }while(name != ""); }


                do{
                    System.out.println("Enter Major");
                    major = sc.next();
                }while(major == "freshman" || major == "sophomore" || major == "junior" || major == "senior");

            System.out.println("Student's status of being a TA/RA (1 for yes 0 for no): ");
            status = sc.nextInt();

            if(status == 1){
                sts = true;
            }else{
                sts = false;
            }
            Graduate g = new Graduate(studentId,name,major,sts);
            g.displayStudentData();
        }

    }
}
