package STUDENTS;

public class Undergraduate extends Student {

    private String undergradLevel;

    //Default Constructor
    Undergraduate(){}

    //Constructor with parameter
    Undergraduate(int studentId, String studentName, String studentMajor, String undergradLevel){
        super();
        super.setStudentId(studentId);
        super.setStudentName(studentName);
        super.setStudentMajor(studentMajor);
        this.undergradLevel = undergradLevel;
    }

    public String getUndergradLevel() {
        return undergradLevel;
    }

    public void setUndergradLevel(String undergradLevel) {
        this.undergradLevel = undergradLevel;
    }

    //getpriorityCode method that get the priority code
    public int getPriorityCode(){
        if(this.getUndergradLevel() == "senior"){
            return 1;
        }else if(this.getUndergradLevel() == "junior"){
            return 2;
        }else if(this.getUndergradLevel() == "sophomore"){
            return 3;
        }else{
            return 4;
        }
    }

    //implementation of abstract method
    public void displayStudentData(){
        String graduate;
        if(super.getStudentGroupCode() == 1 ){
            graduate = "undergraduate";
        }else{
            graduate = "graduate";
        }
        System.out.println("Student ID: " + super.getStudentId() +  ";" + super.getStudentName() + ";" + this.getUndergradLevel() + graduate + ";" + super.getStudentMajor() );
    }


}
