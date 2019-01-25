package org.andestech.learning.rfb19.g3;

public class App3 {

    static private final double WITHDRAWAL_LIMIT=1000;
    static private final double MIN_BALLANCE_LIMIT=10;

    private static double balance = 1000;

    private static void withdrawal(double m) throws BalanceException, LowBallanceException
    {
       if(m > WITHDRAWAL_LIMIT)
       {
          throw new BalanceException("Over limit! " + m, m-WITHDRAWAL_LIMIT);
       }

       if (balance - m < MIN_BALLANCE_LIMIT)
       {
           throw new LowBallanceException("You try withdrawal more than min: " + m + ". Operation canceled..");
       }


       balance -= m;
    }

    public static void main(String[] args) //throws BalanceException,LowBallanceException
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


        try {
        System.out.println("balance=" + balance);
        withdrawal(200);
        System.out.println("balance=" + balance);

        //try {
            withdrawal(500);
            System.out.println("balance=" + balance);
            withdrawal(280);
            System.out.println("balance=" + balance);
        }
        catch (BalanceException ex)
        {
            ex.printStackTrace();
            System.out.println("Over: " + ex.getBallanceOver());
        }
        catch (LowBallanceException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("end of main..");
    }

}
