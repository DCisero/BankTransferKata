import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionHistoryTest {

    //2. code to keep a record of the transfer for both bank accounts in a transaction history

    TransactionHistory transactionHistory;

    @Before
    public void setUp(){
        transactionHistory = new TransactionHistory();
    }

    @Test
    public void payerTransfers100_isRecordedInTransactionHistory(){
        assertEquals("4/17/19: Money Transfer- $100", transactionHistory.history("4/17/19: Money Transfer- $100"));

    }

    @Test
    public void payeeReceives100_isRecordedInTransactionHistory(){
        assertEquals("4/17/19: Account Credit- $100", transactionHistory.history("4/17/19: Account Credit- $100"));

    }
}
