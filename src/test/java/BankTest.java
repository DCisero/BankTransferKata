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
    private Payer payer;
    private Payee payee;

    @Before
    public void setUp() {
        payer = new Payer();
        payee = new Payee();
    }

    @Test
    public void payerTransfers0_payeeAccountIs0() {
        assertEquals(payer.transfer(0), payee.receivedTransfer(0));

    }

    @Test
    public void payerTransfers100Dollars_payeeAccountIs100() {
        assertEquals(payer.transfer(100), payee.receivedTransfer(100));
        assertEquals(payer.transfer(200), payee.receivedTransfer(200));
        assertEquals(payer.transfer(55), payee.receivedTransfer(55));
        assertEquals(payer.transfer(15), payee.receivedTransfer(15));

    }

    //2. code to keep a record of the transfer for both bank accounts in a transaction history

    @Test
    public void payerTransfers0_transferIsRecorded() {

        assertEquals(0, payer.transactionHistory());

    }

    @Test
    public void payeeReceives0FromPayer_transferIsRecorded() {

        assertEquals(0, payee.transactionHistory());

    }

    @Test
    public void payerTransfersMoney_transferIsRecorded() {

        assertEquals(75, payer.transactionHistory());

    }
}
