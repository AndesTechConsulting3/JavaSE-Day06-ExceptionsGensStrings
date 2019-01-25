package org.andestech.learning.rfb19.g3;

import java.nio.Buffer;

public class BalanceException extends Exception {

    public double getBallanceOver() {
        return ballanceOver;
    }
    private double ballanceOver;

    public BalanceException(String message)
    { super(message);

    }

    public BalanceException(String message, double ballanceOver)
    { this(message);
      this.ballanceOver = ballanceOver;

    }


}
