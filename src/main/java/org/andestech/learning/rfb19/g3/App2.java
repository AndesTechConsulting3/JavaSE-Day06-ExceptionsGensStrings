package org.andestech.learning.rfb19.g3;

public class App2 {

    public static void main(String[] args)
    {

        try{
            // reserve memory for data
            //...
            int[] arr2 = {1,2};
            arr2[2] = 12;

        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString()); //== System.out.println(ex)
            ex.printStackTrace();
        }
        finally {
            // free memory for data
            //
            System.out.println("finally block!");
        }

        System.out.println("end of main..");
    }

}
