package 作业.chapter08面向对象中级;

public class HomeWork08 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000);
        System.out.println(bankAccount.deposit(1000));
        System.out.println(bankAccount.withdraw(2000));
        CheckingAccount checkingAccount = new CheckingAccount(5000);
        System.out.println(checkingAccount.deposit(1000));
        System.out.println(checkingAccount.withdraw(2000));
        SavingAccount savingAccount = new SavingAccount(5000);
//        System.out.println(savingAccount.earnMonthInterest());
        System.out.println(savingAccount.deposit(200));
        System.out.println(savingAccount.deposit(200));
        System.out.println(savingAccount.deposit(200));
        System.out.println(savingAccount.deposit(200));
        System.out.println(savingAccount.withdraw(200));
    }
}
class BankAccount{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double deposit(double amount){
        return balance += amount;
    }
    public double withdraw(double amount){
        return balance -= amount;
    }
}
class CheckingAccount extends BankAccount{

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public double deposit(double amount) {
        int balance = getBalance();
        balance += (amount-1);
        setBalance(balance);
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        int balance = getBalance();
        balance -= (amount+1);
        setBalance(balance);
        return balance;
    }
}
class SavingAccount extends BankAccount{
    int count = 3;

    public SavingAccount(int balance) {
        super(balance);
    }
    public double earnMonthInterest(){
        int balance = getBalance();
        count =3;
        setBalance((int) (balance*1.6));
        return balance *1.06;
    }

    @Override
    public double deposit(double amount) {
        int balance = getBalance();
        if (count>0 && count<=3){
            balance += amount;
            setBalance(balance);
            count--;
        }else {
            balance += (amount-1);
            setBalance(balance);
        }
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        int balance = getBalance();
        if (count>0 && count<=3){
            balance -= (amount+1);
            setBalance(balance);
            count--;
        }else {
            balance -= (amount+1);
            setBalance(balance);
        }
        return balance;
    }
}