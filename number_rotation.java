import java.util.*;
class main{
    public static void main(String[] args){
        // Scanner s = new Scanner(System.in);
        int n = 536289;
        int k = 1;
        // n= 536289;
        int tempn = n;
        int c = 0;
        
        while(tempn!=0){
            c++;
            tempn/=10;
        }
        
        int num = n % (int)(Math.pow(10,c-k));
        n = n/(int)(Math.pow(10,c-k));
        num = num *(int)(Math.pow(10,k));
        int ans = num+n;
        System.out.print(ans);
        
        
    }
}

