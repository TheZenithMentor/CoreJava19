package zenithnxt.programming.basicpattern.String;

public class D {
    public static void main(String[] args) {
        // compareTo : used to compare the string lexographically( dictionary )

        String s=new String("APPLE");
        String s1=new String("APPLE");

        // case 1 : when both String are same
        System.out.println(s.compareTo(s1));

        String s3=new String("Apple");
        //case 2 : when s3 is greater than s1 (positive value)
        System.out.println(s3.compareTo(s1));

        // case 3 : when s1 is greater than s3
        System.out.println(s1.compareTo(s3));
    }
}
