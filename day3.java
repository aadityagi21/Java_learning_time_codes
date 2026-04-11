import java.util.*;


public class A{
    public static void main(String[] args){
        int x=1;
        String g="]]]]]]]]]]]]]]]]]]]]]]]]]]]";
        
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        // if(a>0){
        //     System.out.println("Positive");
        // }
        // else if (a<0){
        //     System.out.println("negative");
        // }
        // else{
        //     System.out.println("Zero");
        // }
        // int b=s.nextInt();
        // if(a>b){
        //     System.out.println(a);
        // }
        // else if (b>a){
        //     System.out.println(b);
        // }
        // else if(a==b){
        //     System.out.println("Equal");
        // }
        
//         if(a>=18){
//             System.out.println("Eligible for voting");
//         }
//         else {
//             System.out.println("Not eligible");
//         }
        
        int b=s.nextInt();
        int c=s.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println(b+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
        else{
            System.out.println(c+"is greatest");
        }
      
        
    }
}

// public class Main {
//     public static void main(String[] args) {
//         String y="❁´◡`❁";
//         int x = 1;
//         if(x==1){
//         //     x++;
//         //     x=5;
//         //     x--;
//         }
//         else{
//             x=7;
//         }
//         System.out.print(y);
//     }
// }
