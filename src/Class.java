public class Class {
    public int id;
    public String level;
    public String name;
    public Student[] students;

    public void Class(String level,String name,Student[] students){
        System.out.println("Creating a new class");
        this.id = (int)(Math.random()*10);
        this.level = level;
        this.name = name;
        this.students = students;
    }
//    public void getClassInfo
}
