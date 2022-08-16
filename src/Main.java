import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void intro() throws ParseException {
        System.out.println("Hey there!");
        System.out.println("Welcome to the school Management System \n You have options below: \n" +
                "1. Manage Classes (Click 1 to choose this option) \n" +
                "2. Manage Teachers (Click 2 to choose this option) \n" +
                "3. Manage Staff (Click 3 to choose this option) \n" +
                "### And click 0 to exit the system");
        int choice = scanner.nextInt();
        switch(choice){
            case  1:
                manageClass();
            break;
            case 2:
                manageTeachers();
            break;
            case 3:
                manageStaff();
            break;
            case 0:
                System.exit(1);
                break;
        }
    }
    public static void main (String[] args) throws ParseException {
        intro();
//        ArrayList<Student> students = new ArrayList<>();
//        Student student1 = new Student("Mwenedata Apotre","Year 2A",parseToDate("12/08/2005"),"Bandikure Sudi","UWANYILIGIRA Helene");
//        students.add(student1);
//        Class class1 = new Class("O' level","Year 1A",students);
//        System.out.println("Class added "+ class1.students.get(0).name);
    }



    public static void manageClass() throws ParseException {
        System.out.println("Welcome to Managing Classes");
        System.out.println("You can :\n" +
                "1. Register a new class \n" +
                "2. Remove a class \n" +
                "3. Change information in a certain class \n" +
                "4. Get a class\n" +
                "5. Read all classes ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                try {
                    Class.Register();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                Class.Delete();
            break;
            case 3:
                Class.Edit();
            break;
            default:
             System.exit(10);
        }
    }
    public static void manageTeachers(){
        System.out.println("Welcome to Managing Teachers");

    }
    public static void manageStaff(){
        System.out.println("Welcome to Managing Staff Members");
    }
}
