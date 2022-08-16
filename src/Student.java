import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public int id;
    public String name;
    public String assignedClass;
    public Date dob;
    public String fatherName;
    public String motherName;

    public  Student(String name,String assignedClass,String dob,String fatherName,String motherName) throws ParseException {
        System.out.println("Creating and saving new student");
        this.name = name;
        this.assignedClass = assignedClass;
        this.dob = parseToDate(dob);
        this.fatherName =  fatherName;
        this.motherName = motherName;
    }
    private static Date parseToDate(String date) throws ParseException {
        try {
            Date parseToDate = null;
            parseToDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            return parseToDate;
        } catch (ParseException err) {
            err.getMessage();
            System.out.println("Something failed");
            Date dateDumm = new Date();
            return dateDumm;
        }
    }
    public  Student(String name,String assignedClass,String dob) throws ParseException {
        System.out.println("Creating and saving new student");
        this.name = name;
        this.assignedClass = assignedClass;
        this.dob = parseToDate(dob);
    }
}
