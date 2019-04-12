public class Payee implements Bank{

    public int receivedTransfer(int moneyReceived) {
        return moneyReceived;
    }

    @Override
    public int transactionHistory() {
        return 0;
    }
}
