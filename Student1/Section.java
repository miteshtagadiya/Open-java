package Student1;

import java.util.ArrayList;

class Section {

    private int CRN;
    private String Department;
    private int CourseNumber;
    private String InstructionMode;
    private String MeetingDays;
    private String MeetingTimes;
    private int Capacity;
    private int Enrollment;
    private int InstructorId;
    private ArrayList<StudentEnrollee> list;
    public Section(int a, String d,int c, String im, String md, String mt,int ca, int id){
        CRN = a;
        Department = d;
        CourseNumber = c;
        InstructionMode = im;
        MeetingDays = md;
        MeetingTimes = mt;
        Capacity = ca;
        Enrollment = 0;
        InstructorId = id;
        list = new ArrayList<StudentEnrollee>();
    }
    public ArrayList<StudentEnrollee> getList(){
        return list;
    }
    public int locate(int id){

        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id)
                return i;
        }
        return -1;
    }
    public void withdrawStudent(int id){

        int a = locate(id);
        if (a == -1){
            System.out.println("Not found");
        }
        else {
            list.remove(a);
            System.out.println("Student witdrawn");
        }

    }
    public void addStudent(StudentEnrollee a){
        list.add(a);
        Enrollment = list.size();
    }
    public void displayList(){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public int getEnrollmentNumber(){
        return list.size();
    }
    public void assignGrade(int id, int g){
        int a = locate(id);
        if (a == -1){
            System.out.println("Not found");
        }
        else {
            list.get(a).setGrade(g);
            System.out.println("Grade Assigned");
        }
    }


}