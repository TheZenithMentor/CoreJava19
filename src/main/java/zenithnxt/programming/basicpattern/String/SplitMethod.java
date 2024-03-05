package zenithnxt.programming.basicpattern.String;

public class SplitMethod {
    public static void main(String[] args) {
        String s="MISSISIPPI";
        String s1[]=s.split("S");

        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
        System.out.println(s1.length);

    }
}
