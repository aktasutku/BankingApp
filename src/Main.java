public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("156","Utku","utku@gmail.com","123456789",150.00);
        account1.DepositMoney(100);
        account1.withDrawMoney(250);
    }
}
