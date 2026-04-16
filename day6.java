public class meow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int c=0,k,b=0;
        do{
            k = s.nextInt();           
            int a=k;           
            while(a!=0){
                b=a%10;
                a=a/10;
                c+=b;
            }        
        } while(k!=0);
        System.out.print(c);
        
        
        
        
        int a = s.nextInt();
        boolean f = true;       
        if(a<=1){
            System.out.print("Invalid");
        }
        else{
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    f=false;
                }
            }
            if(f){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        
        if(a!=2 && a!=3 && a!=5 && a!=7 && a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0){
            System.out.println("Prime");
        }
        else if(a==2 || a==3 || a==5 || a==7){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

        
    }
}
