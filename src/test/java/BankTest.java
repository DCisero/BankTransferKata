import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    /*
    Bank Transfer
    1. code to transfer a specified amount of money from one bank account-
        (the payer) to another (the payee)
    2. code to keep a record of the transfer for both bank accounts in a transaction history
    3. code to query a bank account's transaction history for any bank transfers to or from a specific account
     */
    Payer payer;
    Payee payee;

    @Before
    public void setUp(){
        payer = new Payer();
        payee = new Payee();
    }

    @Test
    public void payerDoesNotTransfers0_payeeAccountIs0(){
        payer.transfer(0);

        assertEquals(0,payee.receivedTransfer(0));

    }

    @Test
    public void payerTransfers100Dollars_payeeAccountIs100(){
        payer.transfer(100);

        assertEquals(100,payee.receivedTransfer(100));
    }
}
