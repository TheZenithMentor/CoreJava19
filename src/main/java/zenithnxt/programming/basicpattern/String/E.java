package zenithnxt.programming.basicpattern.String;

public class E {
    public static void main(String[] args) {
        String s = "Hello how are you";

        // convert the string into array based on a seperator
        String arr[]=s.split(" ");

        // print the array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("value at index "+i+" is "+arr[i]);
        }
    }
}
/*
*   assignment : you have to split the String "MISSISIPPI" based on Separator 'S'
* */