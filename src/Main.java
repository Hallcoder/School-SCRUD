import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void intro(){
        System.out.println("Hey there!");
        System.out.println("Welcome to the school Management System \n You have options below: \n" +
                "1. Manage Classes (Click 1 to choose this option) \n" +
                "2. Manage Teachers (Click 2 to choose this option) \n" +
                "3. Manage Staff (Click 3 to choose this option)");
    }
    public static void main (String[] args){
        intro();
        Student student1 = new Student("Mwenedata Apotre","Year 2A",parseToDate("12/08/2005"),"Bandikure Sudi","UWANYILIGIRA Helene");
        System.out.println("New Student:"+student1);
    }

    private static Date parseToDate(String date) throws ParseException {
        Date parseToDate = null;
        try {
            parseToDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException err) {
            err.getMessage();
        }
        return parseToDate;
    }
}
