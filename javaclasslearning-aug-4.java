class Student{
    // static int roll = 2;
    // static String name = "Aditya";
    static int roll = 2;
    static String name = "Aditya";
    static String college = "Parul University";

    void greet(){
        System.out.println("Hello Students");
    }
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }
    static void getDetails(){ // only works if those variables are also static;
        System.out.println(roll+" "+name+" "+college);
    }
}


class Main{
    public static void main(String[] args){
        // Student s1 = new Student();
        // s1.display();
        // s1.getDetails();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s3.roll = 10;
        s2.roll = 15;

        s1.college = "Hetitage institute of technology";
        s1.display();
        s2.display();
        s3.display();
        Student.getDetails();
    }
}
