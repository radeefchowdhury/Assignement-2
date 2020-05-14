
package atmmachine;


public class Account {
    private String name;
    private double balance;
    private String password;
    private static int moneyHand;
    

    public Account() {
    name = "no name";
    balance = 0;
    password = "none";
}
    public Account(String name, double balance, String password){
    this.name = name;
    this.balance = balance;
    this.password = password;
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setMoneyHand(int moneyHand) {
        Account.moneyHand = moneyHand;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getMoneyHand() {
        return moneyHand;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount; 
    }
    public void transfer(double amount, Account acc){
        this.balance -= amount;
        acc.balance += amount; 
    }
}
