package snackbar;

public class Snack{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public Snack(String name, int quantity, double cost, int vendingMachineId){
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  public int getId() {
    return id;
  }

  //getters and setters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public double getCost() {
    return cost;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public int getVendingMachineId() {
    return vendingMachineId;
  }

  // other methods
  public void addToQuantity(int addend) {
    quantity += addend;
  }

  public void buySnack(int numberToBuy) {
    quantity -= numberToBuy;
  }

  public double getTotalCost(int numberToBuy) {
    return cost * numberToBuy;
  }
}