import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionHistoryTest {

    //2. code to keep a record of the transfer for both bank accounts in a transaction history

    TransactionHistory payerAccount;
    TransactionHistory payeeAccount;

    @Before
    public void setUp(){
        payeeAccount = new TransactionHistory();
        payerAccount = new TransactionHistory();
    }

    @Test
    public void payerTransfers100_isRecordedInTransactionHistory(){
        assertEquals("4/17/19: Money Transfer- $100",
                payerAccount.history("4/17/19: Money Transfer- $100"));

        assertEquals("4/18/19: Money Transfer- $500",
                payerAccount.history("4/18/19: Money Transfer- $500"));

        assertEquals("4/19/19: Money Transfer- $25",
                payerAccount.history("4/19/19: Money Transfer- $25"));

    }

    @Test
    public void payeeReceives100_isRecordedInTransactionHistory(){
        assertEquals("4/17/19: Account Credit- $100",
                payeeAccount.history("4/17/19: Account Credit- $100"));

       assertEquals("4/18/19: Account Credit- $65",
               payeeAccount.history("4/18/19: Account Credit- $65"));

        assertEquals("4/17/19: Account Credit- $40",
                payeeAccount.history("4/17/19: Account Credit- $40"));

    }
}
