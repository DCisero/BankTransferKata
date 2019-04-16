import java.util.ArrayList;

public class Payer implements Bank {

//      private String [] history = new String[10];

    public int transfer(int moneySent) {
        return moneySent;
    }

    @Override
    public ArrayList<Integer> transactionHistory(int money) {
        ArrayList<Integer> history = new ArrayList<>();

        for (int i = 0; i < history.size(); i++) {
            history.get(i);
        }

        return history;
    }
    }

