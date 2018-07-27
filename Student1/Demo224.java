package Student1;

import java.util.Scanner;

public class Demo224{
    public static void main(String[] args){


        Scanner sc =new Scanner(System.in);

        int CRN;
        String Department;
        int CourseNumber;
        String InstructionMode;
        String MeetingDays;
        String MeetingTimes;
        int Capacity;
        int InstructorId;

        System.out.println("Add new Section:");

        System.out.println("CRN: ");
        CRN = sc.nextInt();
        System.out.println("Department: ");
        Department = sc.next();
        System.out.println("CourseNumber: ");
        CourseNumber = sc.nextInt();
        System.out.println("InstructionMode: ");
        InstructionMode = sc.next();
        System.out.println("MeetingDays: ");
        MeetingDays = sc.next();
        System.out.println("MeetingTimes: ");
        MeetingTimes = sc.next();
        System.out.println("Capacity: ");
        Capacity = sc.nextInt();
        System.out.println("InstructionId");
        InstructorId = sc.nextInt();


        Section s1 = new Section(CRN,Department,CourseNumber,InstructionMode,MeetingDays,MeetingTimes,Capacity,InstructorId);

        int enroll;
        System.out.println("How Many Student You Want to Enroll?");
        enroll = sc.nextInt();
        for (int i= 1; i<enroll; i++){
            StudentEnrollee s = new StudentEnrollee(i,0);
            s1.addStudent(s);
        }

        System.out.println(enroll + " Students Enrolled SuccessFully.");
        int ch;

        System.out.println("Select Options:");
        System.out.println("1.Display: ");
        System.out.println("2.Assign Grade: ");
        System.out.println("3.Withdraw Student: ");
        System.out.println("0.Exit.");
        do {
        ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s1.displayList();
                    break;
                case 2:
                    int i;
                    int g;
                    System.out.println("Enter Student Id:");
                    i = sc.nextInt();
                    System.out.println("Enter Grade:");
                    g = sc.nextInt();
                    s1.assignGrade(i, g);
                    s1.displayList();
                    break;
                case 3:
                    int id;
                    System.out.println("Enter Student Id To Withdraw Student: ");
                    id = sc.nextInt();
                    s1.withdrawStudent(id);
                    s1.displayList();
                    break;
                case 0:
                    break;
            }
            System.out.println("Select Options:");
            System.out.println("1.Display: ");
            System.out.println("2.Assign Grade: ");
            System.out.println("3.Withdraw Student: ");
            System.out.println("0.Exit.");
        }while (ch != 0);
    }
}