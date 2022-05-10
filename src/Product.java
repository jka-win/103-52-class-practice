import java.math.BigDecimal;

public class Product {
  public static void main(String[] args) {
    var product = new Product("Gallon of gas", BigDecimal.valueOf(4), 10);
    product.printProduct();
    product.totalCost();
  }

  private String name;
  private BigDecimal cost;
  private int quantity;

  public Product(String name, BigDecimal cost, int quantity) {
    this.name = name;
    this.cost = cost;
    this.quantity = quantity;
  }

  public void printProduct() {
    System.out.println("%s costs $%.2f and %d units were purchased"
        .formatted(name, cost, quantity));
  }

  public void totalCost() {
    System.out.println("Total cost is $%.2f"
        .formatted(cost.multiply(BigDecimal.valueOf(quantity))));
  }
}
