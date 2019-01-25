package org.andestech.learning.rfb19.g3;

public class App 
{
    private static void testException(){
        int[] arr = {1,2,3};

        arr[2]=876;

        System.out.println("end of testExc");
    }

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
//        int[] arr = {1,2,3};
//
//        arr[4]=876;

        try {
            testException();
            int a=2, res = 1/(a-3);
            Class.forName("TestClass");

            System.out.println("end of try..");
        }
       // int a =2;
        catch (ArrayIndexOutOfBoundsException ex){

            System.out.println(ex);
            ex.printStackTrace();
            // log to bd, file, ...
            throw ex;
        }
        catch (ArithmeticException | ClassNotFoundException ex){
            System.out.println(ex);
            ex.printStackTrace();
           // feedback -->
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            // log to bd, file, ...
            throw ex;
        }

        System.out.println("end of main");

    }
}
