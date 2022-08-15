import java.util.Date;

public class Student {
    public int id;
    public String name;
    public String assignedClass;
    public Date dob;
    public String fatherName;
    public String motherName;

    public  Student(String name,String assignedClass,Date dob,String fatherName,String motherName){
        System.out.println("Creating and saving new student");
        this.name = name;
        this.assignedClass = assignedClass;
        this.dob = dob;
        this.fatherName =  fatherName;
        this.motherName = motherName;
    }
}
