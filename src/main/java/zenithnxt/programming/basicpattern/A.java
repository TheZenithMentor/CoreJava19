package zenithnxt.programming.basicpattern;


/*
* pattern :
*                * * * * *
*                * * * * *
*                * * * * *
*                * * * * *
*                * * * * *
* */
public class A {
    public static void main(String[] args) {

        for (int i=0;i<5;i++)
        {

            for (int j=0;j<5;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
*
*     for (int i=0;i<2;i++)
        {
            System.out.println("$");
            for (int j=0;j<2;j++ )
            {
                System.out.print("*");
            }
            System.out.println("&");
        }
*
*
*
* */