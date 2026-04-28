public class Main {
    
    boolean incr(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean k = incr(n);
        if(k==true){
            System.out.print("This no. is Prime");
        }
        else{
            System.out.print("This no. is not prime");
        }
        
        
    }
}
