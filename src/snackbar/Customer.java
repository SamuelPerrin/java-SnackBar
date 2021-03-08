package snackbar;

public class Customer{
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  // constructor
  public Customer(String name, double cashOnHand) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  // other methods
  public void addToCashOnHand(double toAdd) {
    cashOnHand += toAdd;
  }

  public void buySnacks(double totalCost) {
    cashOnHand -= totalCost;
  }

}