public class Aadi{
    public static void main(String[] args){
        
        
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         char b = s.next().charAt(0);
//         int c = s.nextInt();
   
//         if(b=='+'){
//             System.out.println(a+c);}    
//         else if(b=='-'){
//             System.out.println(a-b);}        
//         else if(b=='*'){
//             System.out.println(a*c);}
//         else if(b=='/' && c!=0 ){
//             System.out.println(a/c);}        
//         else{
//             System.out.println(": Invalid input");}
        
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // int i =1;
        // while(i<=a){
        //     System.out.println(i);
        //     i+=2;
        // }
                
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 0;
        int rev = 0;
        int lastzero = 0;
        int c = 0;
        int c_sec = 0;
        while(a!=0){
            int last = a%10;
            a=a/10;
            rev *= 10;
            rev += last;
            c++;
        }
        // System.out.println(c);
        
        while(rev!=0){
            int s_last = rev%10;
            rev = rev/10;
            System.out.print(s_last+ " ");
            c_sec++;
        }
        int k = c-c_sec;
        while(k>0){
            System.out.print(0 + " ");
            k--;
        }
      


      
        
        
        
        
    }
}
