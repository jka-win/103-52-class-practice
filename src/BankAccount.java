import java.math.BigDecimal;

public class BankAccount {
  public static void main(String[] args) {
    var account = new BankAccount("Joseph", 500);
    account.deposit(100);
    System.out.println(account);

    var larry = new BankAccount("Larry", 5000);
    var mary = new BankAccount("Mary", 300);
    larry.withdrawal(100);
    mary.deposit(100);
    System.out.println(larry);
    System.out.println(mary);
  }

  private String name;
  private BigDecimal balance;

  public BankAccount(String name, BigDecimal balance) {
    this.name = name;
    this.balance = balance;
  }

  public BankAccount(String name, int balance) {
    this(name, BigDecimal.valueOf(balance));
  }

  public String getName() {
    return name;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public BigDecimal deposit(BigDecimal amount) {
    balance = balance.add(amount);
    return balance;
  }

  public BigDecimal deposit(int amount) {
    return deposit(BigDecimal.valueOf(amount));
  }

  public BigDecimal withdrawal(BigDecimal amount) {
    balance = balance.subtract(amount);
    return balance;
  }

  public BigDecimal withdrawal(int amount) {
    return withdrawal(BigDecimal.valueOf(amount));
  }

  @Override
  public String toString() {
    return "%s's account balance: $%.2f"
        .formatted(name, balance);
  }
}
