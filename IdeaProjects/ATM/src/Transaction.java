public abstract class Transaction {
    protected double amount;
    protected Account account;
    protected String transactionId;

    public Transaction(double amount, Account account, String transactionId) {
        this.amount = amount;
        this.account = account;
        this.transactionId = transactionId;
    }

    public abstract void execute();
}
