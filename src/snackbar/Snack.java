package snackbar;

public class Snack {
   private static int counter = 0;

   private int id;
   private String name;
   private VendingMachine vendingMachine;

   private double cost;
   private int quantity = 0;

   public Snack(String name, VendingMachine snackLocation, double cost, int quantity) {
      this.name = name;
      this.id = counter++;
      this.vendingMachine = snackLocation;
      this.cost = cost;
      this.quantity = quantity;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id) {
      this.id = id;
   }

   /**
    * @return the id
    */
   public String getId() {
      return id;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param cost the cost to set
    */
   public void setCost(double cost) {
      this.cost = cost;
   }

   public double getCost() {
      return this.cost;
   }

   /**
    * @param vendingMachine the vendingMachine to set
    */
   public void setVendingMachine(String vendingMachine) {
      this.vendingMachine = vendingMachine;
   }

   /**
    * @return the vendingMachine
    */
   public String getVendingMachine() {
      return vendingMachine;
   }

   /**
    * @param quantity the quantity to add
    */
   public void addQuantity(int quantity) {
      this.quantity += quantity;
   }

   /**
    * @param quantity the quantity to remove
    */
   public void removeQuantity(int quantity) {
      this.quantity -= quantity;
   }

   /**
    * @return the quantity
    */
   public int getQuantity() {
      return quantity;
   }

   public void buy(int quantity) {
      this.quantity -= quantity;
   }

   public double getCost(int quantity) {
      return quantity * this.cost;
   }

}