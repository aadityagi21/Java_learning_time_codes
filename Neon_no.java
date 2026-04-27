public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),sum=0;
        int k = n*n;
        while(k!=0){
            int rem=k%10;
            sum+=rem;
            k/=10;
        }
        if(n==sum){
            System.out.print("Number is neon");
        }
        else{
            System.out.print("Not neon number");
        }
    }
}
