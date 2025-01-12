public class DepositTransaction extends Transaction{
    public DepositTransaction(double amount, Account account, String transactionId) {
        super(amount, account, transactionId);
    }

    @Override
    public void execute() {
        account.credit(amount);

    }
}
