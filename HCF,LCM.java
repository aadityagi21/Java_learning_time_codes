public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),g;
        int a = s.nextInt();
        if(n>=a)g=n;
        else g=a;
        for(int i=g;i>=1;i--){
            if(a%i==0 && n%i==0){
                System.out.println("HCF : " + i);
                System.out.println("LCM : "+ (n*a)/i);
                break;
            }
        }
       
    }
}
