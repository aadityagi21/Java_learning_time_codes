class Main {
    public static void main(String[] args) {
        String name = "Aditya Tyagi "; // string literal
        String str = new String("gasoline"); // string new object 
     
        System.out.println(name);
        System.out.println(str.length()); //length
        System.out.println(name.charAt(3)); //charAt
        System.out.println(str.substring(7)); //substring
        System.out.println(str.substring(2,5));
        System.out.println(name.concat(str)); //concat
        System.out.println(name);
        System.out.println(name.indexOf("a"));//indexOf
        System.out.println(name.indexOf("e"));
        System.out.println(name.indexOf("it"));
        System.out.println(name.indexOf("a",7));
        System.out.println(name.lastIndexOf("a"));//lastIndexOf
        System.out.println(str.equals("Meow")); //check equals or not
        
        
        String s1 = "Hello I am Aditya Tyagi";
        String s2 = "Hello I am Aditya Tyagi";
        String s3 = new String("Hello I am Aditya Tyagi");
        String s4 = new String("Hello I am Aditya Tyagi");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4); //why false ?
        //String will store in "string pool" if make using
        //string literal because for saving memory its like 
        //just copy make copy of it.
        
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)>='A' && name.charAt(i)<'Z')
        // }
        
        // string are immutable.
    }
}
