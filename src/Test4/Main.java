package Test4;

public class Main {
    public static void main(String[] args) {
        BankAccount info = new BankAccount("Иван", 3500);

        info.deposit(500);
        info.printBalance();
        info.withdraw(3000);
        info.printBalance();
    }
}
