package org.andestech.learning.rfb19.g3;

public class App3 {

    static private final double WITHDRAWAL_LIMIT=1000;
    private static double balance = 23000;

    private static void withdrawal(double m) throws BalanceException
    {
       if(m > WITHDRAWAL_LIMIT)
       {
          throw new BalanceException("Over limit! " + m, m-WITHDRAWAL_LIMIT);
       }

       balance -= m;
    }

    public static void main(String[] args) throws BalanceException
    {

        try{
            // reserve memory for data
            //...
            int flag = 2;
          if(flag==1) throw new IndexOutOfBoundsException("12");

            if(flag==1) throw new ArithmeticException("/ zero");

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

        System.out.println("balance=" + balance);
        withdrawal(200);
        System.out.println("balance=" + balance);

        try {
            withdrawal(1200);
            System.out.println("balance=" + balance);
        }
        catch (BalanceException ex)
        {
            ex.printStackTrace();
            System.out.println("Over: " + ex.getBallanceOver());
        }


    }

}
