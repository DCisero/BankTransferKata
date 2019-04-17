import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    /*
    Bank Transfer
    1. code to transfer a specified amount of money from one bank account-
        (the payer) to another (the payee)
    3. code to query a bank account's transaction history for any bank transfers to or from a specific account
     */
    private Bank payer;
    private Bank payee;

    @Before
    public void setUp() {
        payer = new Bank();
        payee = new Bank();
    }

    @Test
    public void payerTransfers0_payeeReceives0Dollars() {
        assertEquals(payer.transfer(0), payee.receivedTransfer(0));

    }

    @Test
    public void payerTransfersMoney_payeeReceivesMoney() {
        assertEquals(payer.transfer(100), payee.receivedTransfer(100));
        assertEquals(payer.transfer(200), payee.receivedTransfer(200));
        assertEquals(payer.transfer(55), payee.receivedTransfer(55));
        assertEquals(payer.transfer(15), payee.receivedTransfer(15));

    }

}
