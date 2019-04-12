public class Payer implements Bank {

    public int transfer(int moneySent) {
        return moneySent;
    }

    @Override
    public int transactionHistory() {
        return 0;
    }
}
