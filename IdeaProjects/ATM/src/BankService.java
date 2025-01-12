import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankService {
    private final Map<String, Account> accounts = new ConcurrentHashMap<>();

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        accounts.put(accountNumber, new Account(accountNumber, accountHolderName, initialBalance));
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void processTransaction(Transaction transaction) {
        transaction.execute();
    }
}
