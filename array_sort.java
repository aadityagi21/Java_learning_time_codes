public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []a = new int[5];
        
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        };
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}
