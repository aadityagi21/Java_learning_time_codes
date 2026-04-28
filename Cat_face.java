public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==j | i+j==n+1 | j==n | j==1) && i<=n/2-1 ){
                    System.out.print("* ");
                }
                else if(j==1 | j==n | i==n/2-1 | i==n | (i==n/2+1 && j==n/2-2) | (i==n/2+1 && j==n-2) | (i==n-2 && j>2 && j<n-1) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.print("\n");
        }
    }
}
