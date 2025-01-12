public class WithdrawalTransaction extends Transaction{
    public WithdrawalTransaction(double amount, Account account, String transactionId) {
        super(amount, account, transactionId);
    }

    @Override
    public void execute() {
        account.debit(amount);
    }
}
