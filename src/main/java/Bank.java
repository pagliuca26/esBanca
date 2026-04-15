import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    //costruttore
    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String accountNumber){
        BankAccount newAccount = new BankAccount(accountNumber, initialBalance); //creo il nuovo account
        accounts.add(newAccount); //lo metto nella lista
    }

    //cerca l'account corrispondente
    private BankAccount findAccount(String accountNumber) {
        for(BankAccount account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount){
        BankAccount account = findAccount(accountNumber); //crea un oggetto account e lo cerca nell'array
        if(account != null)
            account.deposit(amount);
        else
            System.out.println("Conto non trovato");
    }

    public void withdraw(String accountNumber, double amount){
        BankAccount account = findAccount(accountNumber);
        if(account != null)
            account.withdraw(amount);
        else
            System.out.println("Conto non trovato");
    }

    public double getBalance(String accountNumber){
        BankAccount account = findAccount(accountNumber);
        if(account != null)
            return account.getBalance();
        else{
            System.out.println("Conto non trovato");
            return 0;
        }
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount){
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);

        if(fromAccount != null && toAccount != null){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        }
        else{
            System.out.println("Conto non trovato");
        }
    }

    public void calculateInterests(){
        for(BankAccount account : accounts){
            account.addInterests();
            //ciaooooo
        }
    }
}
