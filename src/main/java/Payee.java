public class Payee implements Bank{

    private String [] history = new String[2];

    public int receivedTransfer(int moneyReceived) {
        return moneyReceived;
    }

    @Override
    public String[] transactionHistory(int money) {
        return new String[0];
    }

//    @Override
//    public String [] transactionHistory() {
//        history[0] = history.toString();
//        return history;
//    }


}
