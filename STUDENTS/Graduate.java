package STUDENTS;

public class Graduate extends Student {

    private boolean isTaRa;

    //Default Constructor
    Graduate(){}

    //Constructor with parameter
    Graduate(int studentId, String studentName, String studentMajor, boolean isTaRa){
        super();
        super.setStudentId(studentId);
        super.setStudentName(studentName);
        super.setStudentMajor(studentMajor);
        this.isTaRa = isTaRa;
    }

    public boolean isTaRa() {
        return isTaRa;
    }

    public void setTaRa(boolean taRa) {
        isTaRa = taRa;
    }

    //implementation of abstract method
    public void displayStudentData(){
        String graduate;
        if(super.getStudentGroupCode() == 1 ){
            graduate = "undergraduate";
        }else{
            graduate = "graduate";
        }
        String ta;
        if(this.isTaRa){
            System.out.println("Student ID: " + super.getStudentId() +  ";" + super.getStudentName() + ";"  + graduate + ";"+ "TA" + super.getStudentMajor() );
        }else{
            System.out.println("Student ID: " + super.getStudentId() +  ";" + super.getStudentName() + ";"  + graduate + ";" + super.getStudentMajor() );
        }

    }

}
