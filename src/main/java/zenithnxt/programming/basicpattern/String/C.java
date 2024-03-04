package zenithnxt.programming.basicpattern.String;

public class C {
    public static void main(String[] args) {

        //equals
        String s=new String("hello");
        String s1=new String("hello");

        // equals compare the value of the object
        System.out.println(s.equals(s1));

        // compare the address
        System.out.println(s==s1);

        // compare same string with different case
        String s3=new String("pune");
        String s4=new String("PUNE");

        System.out.println(s3.equals(s4));

        // equalsIgnoreCase : comparison of string by ignoring the cases(uppercase and lowercase)
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
