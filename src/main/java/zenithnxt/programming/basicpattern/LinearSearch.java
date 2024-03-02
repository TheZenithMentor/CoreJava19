package zenithnxt.programming.basicpattern;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={7,5,3,2,1,9};
        int search=10;
        int k=0;
        // k=1 : found , k=0 : not found
        for (int i=0;i<a.length;i++)
        {
            // comparison
            if(search==a[i])
            {
                k=1;
            }

        }
        //check the value of k
        if (k==1)
        {
            System.out.println("element found ");
        }
        else
        {
            System.out.println("Element not found");
        }


    }
}

// Modify the program and also print the index where we found the value
