public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),f=0,i=0;
        
        while(n!=0){
            int rem = n%10;
            int a = rem;
            if(a==0){
                System.out.print("Duck Number");
                f++;
                break;
            }
            n/=10;
        }
        if(f==0){
            System.out.print("Not Duck number");
        }
    }
}
