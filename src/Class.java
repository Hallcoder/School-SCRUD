import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    public static Scanner scanner = new Scanner(System.in);
    public int id;
    public enum Level{
        O_LEVEL,
        A_LEVEL
    }
    public Level level;
    public String name;
    public ArrayList<Student> students;

    public  Class(Level level,String name,ArrayList<Student> students){
        System.out.println("Creating a new class");
        this.id = (int)(Math.random()*10);
        this.level = level;
        this.name = name;
        this.students = students;
    }
   public static void Register() throws Exception {
       Level level = Level.O_LEVEL;
       String name;
       String studentName;
       String className;
       String dob;
       ArrayList<Student> students = new ArrayList<Student>();
       System.out.println("The Instructions to register a new class are pretty easy, \n Just input what we ask you!! Let's Go:");
       System.out.println("Which Level is the class in, Choose : \n" +
               "A. O LEVEL \n" +
               "B. A LEVEL");
       String choice = scanner.nextLine();
       if(choice == "A"){
           level = Level.O_LEVEL;
       }else if(choice == "B"){
           level = Level.A_LEVEL;
       }
       System.out.println("Class Name eg:'Year 1A'");
       name = scanner.nextLine();
       System.out.println("How many students do you want to register right now, Remember you can do it later Choose: \n" +
               "1. Do it now \n" +
               "2. Do it later");
       int choice1 = scanner.nextInt();
       scanner.nextLine();
       switch (choice1){
           case 1:
               System.out.println("How many students do you want to register now:");
               int choice2 = scanner.nextInt();
               scanner.nextLine();
               for(int i=0;i<choice2;i++){
                   System.out.println("Student"+(i+1));
                   System.out.println("\tStudent's name:");
                   studentName = scanner.nextLine();
                   System.out.println("\tStudents's classname:");
                   className = scanner.nextLine();
                   System.out.println("\tStudent's date of birth: 'eg(12/08/2005)'");
                   dob = scanner.nextLine();
                   Student newStudent = new Student(studentName,className,dob);
                   students.add(newStudent);
               }
               Class newClass = new Class(level,name,students);
               System.out.println("So you are now set a new class it created with the following info:");
               System.out.println("Class ID:" + newClass.id + "\n" +
                       "ClassName:" + newClass.name + "\n" +
                       "Class Level:" + newClass.level + "\n");
               break;
           case 2:
                newClass = new Class(level,name,students);
               System.out.println("So you are now set a new class it created with the following info:");
       }
   }
   public static  void Edit(){

   }
   public static void Delete(){

   }
}
