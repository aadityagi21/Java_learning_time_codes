import java.util.*;

class Student{
    int roll;
    String name;
    float marks = 64.8f;
    String myName = "Aditya ";
    // Student(){
    //     int roll = 11123;
    //     name = "Cat";
    //     float marks = 64.8f;
    // }

    // Student(int r,float m ,String n ){
    //     roll = r;
    //     marks = m;
    //     myName = n;
    // }

    // Student(int roll,float marks ,String myName ){ // 0
    //     roll = roll;
    //     marks = marks;
    //     myName = myName;
    // }

    Student(int roll,float marks ,String myName ){ // Normally kaam karega
        this.roll = roll;
        this.marks = marks;
        this.myName = myName;
    }
    
}

class Main {
    public static void main(String[] args) {
        int[] cat = new int[10];
        String[] names = new String[13];
        Student[] student = new Student[10];
        // System.out.println(Arrays.toString(cat));
        // System.out.println(Arrays.toString(names));
        // System.out.println(Arrays.toString(student));

        // Student s1 = new Student();
        // Student s2 = new Student();
        // s1.roll = 2;
        // s2.roll = 23;
        // System.out.println(s1.roll);
        // System.out.println(s1.name);

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s2.roll+s1.roll);

        // Student s3 = new Student();
        // Student s4 = s3;
        // System.out.println(s3);
        // System.out.println(s4);

        // s2.marks = 34.2f;
        // s2.name = "aditya";

        // System.out.println(s3.marks);
        // System.out.println(s2.marks);


        Student s4 = new Student(21,23.4f,"car");

        System.out.println(s4.roll);










    }
}
