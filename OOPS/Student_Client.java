package OOPS;

public class Student_Client {
    public static void main(String[] args) {
        System.out.println("hello");
        Student s = new Student(); //s is a reference variable
    
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro_yourself();
        Student s1 = new Student();
        s1.name = "kunal";
        s1.age = 22;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.Intro_yourself();
        s1.SayHey("raju");
        Student.Mentor_Name();
    }
    
}
