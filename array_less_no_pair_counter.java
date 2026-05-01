public class Main {
    
    public static int less_than_counter(int a[]){
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []a = new int[5];
        
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.print(less_than_counter(a));
        
    }
}

