public interface AccountState {
    void deposit(Account account, double depositAmount);
    void withdraw(Account account, double withdrawAmount);
    void suspend(Account account);
    void activate(Account account);
    void close(Account account);
}