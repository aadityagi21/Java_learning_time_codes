public class Main {//comment
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toLowerCase();
        int i=0,j=str.length()-1;
        int f=0;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                f++;
                break;
            }
            i++;
            j--;
        }
        if(f==0){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Its not Palindrome");
        }
        
        
    }
}
