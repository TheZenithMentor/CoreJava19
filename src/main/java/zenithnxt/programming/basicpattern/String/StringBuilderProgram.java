package zenithnxt.programming.basicpattern.String;

public class StringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder r = new StringBuilder("hello");
        System.out.println(r);
        r.append("world");
        System.out.println(r);

        // reverse() : to reverse the stringBuilder
        System.out.println(r.reverse());

        StringBuilder r1 = new StringBuilder("Pune");
        r1.insert(2,"JAVA");
        System.out.println(r1);
    }
}
/*
* 1.  Try out the method for StringBuffer
* 2.  Write difference StringBuilder vs StringBuffer
* 3.  String -> StringBuilder/StringBuffer and also vice verse( 4 comparison)
* 4.  prepare a chart of method with working and return and description
* */