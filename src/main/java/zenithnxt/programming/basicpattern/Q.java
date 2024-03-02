package zenithnxt.programming.basicpattern;

public class Q {
    public static void main(String[] args) {
        int a[]={1,1,1,1,1,1,1};
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            if(1==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
