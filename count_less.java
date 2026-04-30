public class Main {
    
    public static int count_less(int arr[] , int n){
        int i=0;
        for(int j:arr){
            if(j<n){
                i++;
            }
        }
        return i++;
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int arr[] = new int[25];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        int n=s.nextInt();
        System.out.print(count_less(arr,n));
        
        

    
    }
}
