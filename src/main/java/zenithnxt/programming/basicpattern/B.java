package zenithnxt.programming.basicpattern;

public class B {
    public static void main(String[] args) {
        int a=1;
        for (int i=0;i<5;i++)
        {

            for (int j=0;j<5;j++)
            {
                System.out.print(a++ + "    ");
            }
            System.out.println();
        }
    }
}
