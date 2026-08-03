import java.util.*;

class Student{
  int roll; // instance variable
  int age;
  String name;

  // Student(int roll,int age,String s,){ // local variable
  //   oll=roll;
  //   age=age;
  //   name = s;
  // }

  // void setVal(int roll,int age,String name,Student s){
  //   s.roll = roll;
  //   s.age = age;
  //   s.name = name;

  // }

  void setVal(int roll,int age,String name){
    this.roll = roll;
    this.age = age;
    this.name = name;

  }

  void details(){
    System.out.println(roll + " " + age + " " + name);
  }

}

public class Main {
    public static void main(String[] args) {
      Student s1 = new Student();
      // s1.roll = 23;
      s1.setVal(2,3,"aditya");
      s1.details();

      Student s2 = new Student();
      s2.setVal(24,222,"tyagi");
      s2.details();
    }
}
