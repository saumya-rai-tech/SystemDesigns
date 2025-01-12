import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

public class ATM {
    private BankService bankService;
    private CashDispenser cashDispenser;
    private static final AtomicLong transactionCounter = new AtomicLong(0);

    public ATM(BankService bankService, CashDispenser cashDispenser){
        this.bankService = bankService;
        this.cashDispenser = cashDispenser;
    }

    public boolean authenticate(Card card, String pin){
        String cardPin = card.getPin();
        if(cardPin.equalsIgnoreCase(pin)){
            return true;
        }
        else{
            return false;
        }
    }
    public double checkBalance(String accountNumber) {
        Account account = bankService.getAccount(accountNumber);
        return account.getBalance();
    }
    private String generateTransactionId() {
        long transactionNumber = transactionCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "TXN" + timestamp + String.format("%010d", transactionNumber);
    }

    public void withDrawCash(String accountNumber, double amount){
        Account account = bankService.getAccount(accountNumber);
        Transaction transaction = new WithdrawalTransaction(amount, account, generateTransactionId());
        bankService.processTransaction(transaction);
    }
    public void depositCash(String accountNumber, double amount){
        Account account = bankService.getAccount(accountNumber);
        Transaction transaction = new DepositTransaction(amount, account, generateTransactionId());
        bankService.processTransaction(transaction);
    }

}
