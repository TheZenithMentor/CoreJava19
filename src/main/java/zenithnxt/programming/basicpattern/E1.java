package zenithnxt.programming.basicpattern;

public class E1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            // 1st space
            for(int j=0;j<(4-i);j++)
            {
                System.out.print(" ");
            }

            for (int k=0; k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
