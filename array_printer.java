// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []a = new int[5];
        
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.print(Arrays.toString(a));// it creates a string copy
    }
}
