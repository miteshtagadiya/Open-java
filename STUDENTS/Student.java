package STUDENTS;

abstract class Student {
    protected int studentId;
    protected String studentName;
    protected int studentGroupCode;
    protected String studentMajor;

    //default constructor
    Student(){
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGroupCode() {
        return studentGroupCode;
    }

    public void setStudentGroupCode(int studentGroupCode) {
        this.studentGroupCode = studentGroupCode;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }


    //abstract method
    public abstract void displayStudentData();


}
