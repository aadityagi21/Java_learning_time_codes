public class a{
    public static void main() {
        
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt() , i=2;
        // while(i<a){
        //     if(a%i==0){
        //         System.out.println("Not Prime no.");
        //         break; 
        //     }
        //     else if(i==a-1){ 
        //         System.out.println("Prime no.");
        //     } 
        //     i++;
        // }
        // if(a==1 || a<0) { 
        //     System.out.println("Not Valid no"); 
        // } 
        
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         boolean b=true;
        
//         int i=2;
//         while(i<a){
//             if(a%i==0){
//                 b = false;
//             }
//             i++;
//         }
//         if(b){
//             System.out.println("Prime no.");
//         }
//         else{
//             System.out.println("Not Prime no");
//         }
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(a+ " X "+ i + " = " + a*i);
            i++;
        }
    }
}
