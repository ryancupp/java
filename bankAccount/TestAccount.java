public class TestAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();

        account1.depositChecking(1000);
        account1.withdrawChecking(500);
        account1.displayBalances();
    }
}