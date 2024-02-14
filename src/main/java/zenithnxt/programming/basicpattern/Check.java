package zenithnxt.programming.basicpattern;

public class Check {
    public static void main(String[] args) {
        for (int i=0;i<2;i++)
        {

            for (int j=0;j<2;j++ )
            {
                System.out.print("$");
            }
            System.out.println("@");
        }
    }
}
/*
*     for practise
*  1.     for (int i=0;i<2;i++)
        {

            for (int j=0;j<2;j++ )
            {
                System.out.print("$");
            }
            System.out.println("@");
        }
*
*
* 2.     for (int i=0;i<2;i++)
        {
           System.out.print("Q");
            for (int j=0;j<2;j++ )
            {
                System.out.print("$");
                System.out.println();
            }
            System.out.print("@");
        }
*
*
* 3.     for (int i=0;i<2;i++)
        {
          System.out.print("$");
          System.out.println("$");
            for (int j=0;j<2;j++ )
            {
                System.out.print("$");
            }
            System.out.println("@");
            System.out.println();
        }
*
*
* */