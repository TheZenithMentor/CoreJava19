package zenithnxt.programming.basicpattern.String;

public class B {
    public static void main(String[] args) {
        String s = "TheTajHotel";
        // length
        System.out.println(s.length());

        //into the cases
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        // concatenation : concat
        String s1 = "In Mumbai";
        System.out.println(s.concat(s1));


        String s2 = "PUNE";
        //extract a character from a string : charAt(index)
        System.out.println(s2.charAt(1));

        // contains
        String s3 = "YOU ARE CHAPRI";
        System.out.println(s3.contains("H"));

        // contains(charsequence)
        String s4 = "MUMBAI";
        System.out.println(s4.contains("UM"));

        //substring
        String s5 = "INDIAISGREAT";
        System.out.println(s5.substring(2));
        System.out.println(s5.substring(2, 9));


        // indexOf
        System.out.println(s5.indexOf('G'));
        System.out.println(s5.indexOf('A'));
        System.out.println(s5.indexOf('A', 5));
        System.out.println(s5.indexOf("IS"));

    }
}
