package zenithnxt.programming.basicpattern.String;

public class F {
    //String into char array : toCharArray();
    public static void main(String[] args) {
        String s = "ZenithNxt";
        char c[] = s.toCharArray();

        //print the array to know what is inside the char array

        for (int i = 0; i < c.length; i++) {
            System.out.println("value at index " + i + " is " + c[i]);
        }


        // replace method : it is used to replace a character in the String
        String g="Mahabharat";
        System.out.println(g.replace('a','P'));

        // trim method : remove the spaces
        String l="    pune";
        System.out.println(l.length());
        String l1=l.trim();
        System.out.println(l1);
        System.out.println("length after trim "+l1.length());

    }
}
