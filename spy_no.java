public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),pro=1,sum=0;
        
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        if(pro==sum){
            System.out.print("No. is spy");
        }
        else{
            System.out.print("Not spy number");
        }
        
    }
}
