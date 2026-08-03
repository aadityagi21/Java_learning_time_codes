import java.util.*;

class College{
  static String name;
  String student;
  int year;

  void setVal(String name,String student,int year){
    this.name = name;
    this.student = student;
    this.year = year;
  }

  void printer(){
    System.out.println(name+ " , " + student + " , " + year);
  }
}


public class Main {
    public static void main(String[] args) {
      College c1 = new College();
      c1.setVal("pit","aditya tyagi",2026);
      c1.printer();

      College c2 = new College();
      c2.setVal("pit","aditya tyagi",2026);
      c2.printer();

    }
}
