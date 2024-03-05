package zenithnxt.programming.basicpattern.String;

public class StringMutability {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s);
        s.concat("world");
        System.out.println(s);
    }
}
