package OOPS;

public class Student {
    String name;
    int age;

    public void Intro_yourself() {
        System.out.println("My name is " + this.name + " and age is " + this.age);
    }

    public void SayHey(String name) {
        System.out.println(this.name + " say hey " + name);
    }

    public static void Mentor_Name() {
        // System.out.println("Mentor name xyz" + name);
    }

    static {
        System.out.println("i am in static block");
    }
}
