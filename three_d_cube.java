public class Main { //3dcube
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1 && j<=n/2-2) | (j==1 && i<n/2-2) | (i==n/2-2 && j<=n/2-2) | (j==n/2-2 && i<n/2-2) ){//for first box
                    System.out.print("* ");
                }
                else if((i==5 && j>n/4-1 && j<n/2+3) | (j==5 && i>=5 && i<n/2+3 ) | (i==n/2+2 && j>n/4 && j<n/2+3 ) | ( j==n/2+2 && i>5 && i<n/2+3 ) ){//for second box
                    System.out.print("* ");
                }
                else if(( i==j && i<n/4 ) | (i==j && i>n/2-2 && i<n/2+3) | (i==2 && j==n/2-1) | (i==3 && j==n/2) | (i==4 && j==n/2+1) | (i==n/2-1 && j==2) | (i==n/2 && j==3) | (i==n/2+1 && j==4) ){
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
