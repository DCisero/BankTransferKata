public class Payer implements Bank {

//      private String [] history = new String[10];

    public int transfer(int moneySent) {
        return moneySent;
    }

    @Override
    public String [] transactionHistory(int money) {
        String [] history = new String[money];

        return history;
    }
    }

