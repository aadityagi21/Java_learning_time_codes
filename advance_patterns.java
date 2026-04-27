public class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
         for(int a=1;a<=10;a++){
                System.out.print("\n");
            }
            
        
        for(int i=1;i<=n;i++){
            
            for(int k=1;k<=10;k++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=n;j++){
                if(i==1 | i==n | j==1 | j==n | j==n/2+1 | i==n/2+1){
                    System.out.print("❌");
                }
                else if(i>1 && i<n/2+1 && j<n/2+1){
                    System.out.print("€ ");
                }
                else if(i>1 && i<n/2+1 && j>n/2+1){
                    System.out.print("£ ");
                }
                else if(i>1 && i>n/2+1 && j<n/2+1){
                    System.out.print("₹ ");
                }
                else if(i>1 && i>n/2+1 && j>n/2+1){
                    System.out.print("$ ");
                }
                
            }
            System.out.print("\n");
        }
        
        for(int a=1;a<=10;a++){
            System.out.print("\n");
        }
    }
}
