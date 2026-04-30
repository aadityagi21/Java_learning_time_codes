public class Main {
    
    public static void count_even(int arr[]){
        
        for(int i:arr){
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int arr[] = new int[25];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        count_even(arr);
    
    }
}
