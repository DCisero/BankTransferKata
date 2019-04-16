import java.util.ArrayList;

public class Payee implements Bank{

    private String [] history = new String[2];

    public int receivedTransfer(int moneyReceived) {
        return moneyReceived;
    }


    @Override
    public ArrayList<Integer> transactionHistory(int money) {
        return null;
    }
}
