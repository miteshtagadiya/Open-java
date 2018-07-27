package Student1;

import java.io.*;
import java.util.*;


class StudentEnrollee {
    private int StudentId;
    private int grade;

    public StudentEnrollee(){
        StudentId = 0;
        grade = 0;
    }
    public StudentEnrollee(int id, int g){
        StudentId = id;
        grade = g;
    }
    public int getId(){
        return StudentId;
    }
    public void setId(int a){
        StudentId = a;

    }
    public void setGrade(int a){
        grade = a;
    }
    public int getGrade(){
        return grade;
    }
    public String toString(){
        return "ID:" + Integer.toString(StudentId) + " Grade:" + Integer.toString(grade);
    }

}