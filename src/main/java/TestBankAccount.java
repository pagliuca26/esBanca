public class TestBankAccount {
    public static void main(String[] args){
        BankAccount conto1 = new BankAccount("IT001");
        BankAccount conto2 = new BankAccount("IT002", 1000);
        BankAccount conto3 = new BankAccount("IT003", 300, 0.007);

        conto1.deposit(500);
        conto1.withdraw(200);
        conto1.addInterests();

        conto2.withdraw(400);
        conto2.addInterests();

        conto2.deposit(100);
        conto3.addInterests();

        System.out.println("Saldo conto1 (" + conto1.getAccountNumber() + "): " + conto1.getBalance() );
        System.out.println("Saldo conto2 (" + conto2.getAccountNumber() + "): " + conto2.getBalance() );
        System.out.println("Saldo conto3 (" + conto3.getAccountNumber() + "): " + conto3.getBalance() );

    }
}
