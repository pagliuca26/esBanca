public class BankAccount {
    private double saldo;
    private double tassoInteresse;
    private String numeroConto;

    //primo costruttore
    public BankAccount(String accountNumber){
        saldo = 0;
        tassoInteresse = 0.005;
        numeroConto=accountNumber;
    }

    //secondo costruttore
    public BankAccount(String accountNumber, double initialBalance){
        saldo = initialBalance;
        tassoInteresse = 0.005;
        numeroConto=accountNumber;
    }

    //terzo costruttore
    public BankAccount(String accountNumber, double initialBalance, double interestRate){
        saldo = initialBalance;
        tassoInteresse = interestRate;
        numeroConto=accountNumber;
    }

    //metodi
    public void deposit(double amount){
        if(amount > 0){
            saldo += amount;
        }
        else{
            System.out.println("Deposito non consentito");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= saldo){
            saldo -= amount;
        }
        else{
            System.out.println("Prelievo non consentito");
        }
    }

    public void addInterests(){
        saldo += saldo*tassoInteresse;
    }

    public double getBalance(){
        return saldo;
    }

    public String getAccountNumber(){
        return numeroConto;
    }
}
