public class TestBank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Aggiunta conti
        bank.addAccount(1000, "IT001");
        bank.addAccount(2000, "IT002");

        System.out.println("Aggiunta:");
        System.out.println("Saldo IT001: " + bank.getBalance("IT001"));
        System.out.println("Saldo IT002: " + bank.getBalance("IT002"));

        // Operazioni
        bank.deposit("IT001", 500);
        bank.withdraw("IT002", 300);

        System.out.println("Deposito/Ritiro:");
        System.out.println("Saldo IT001: " + bank.getBalance("IT001"));
        System.out.println("Saldo IT002: " + bank.getBalance("IT002"));

        // Bonifico
        bank.transfer("IT001", "IT002", 200);

        System.out.println("Trasferimento:");
        System.out.println("Saldo IT001: " + bank.getBalance("IT001"));
        System.out.println("Saldo IT002: " + bank.getBalance("IT002"));

        // Interessi
        bank.calculateInterests();
        System.out.println("Interessi:");
        System.out.println("Saldo IT001: " + bank.getBalance("IT001"));
        System.out.println("Saldo IT002: " + bank.getBalance("IT002"));
    }
}