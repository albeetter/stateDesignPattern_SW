public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit successful. " + account);
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            account.setBalance(account.getBalance() - withdrawAmount);
            System.out.println("Withdrawal successful. " + account);
        } else {
            System.out.println("Insufficient balance for withdrawal. " + account);
        }
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }

    public String toString() {
        return "Active State";
    }
}
