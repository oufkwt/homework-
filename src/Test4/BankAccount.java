package Test4;

public class BankAccount {
    private String owner;
    private int balance;

    //создаю конструктор
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    //сеттер для владельца
    public void setOwner(String owner){
        this.owner = owner;
    }
    //геттеры
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    //методы amount
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Сумма: " + balance + ".\nВладелец: " + owner);
    }
}
