package snackbar;

public class Snack {
   private String id;
   private String name;
   private String vendingMachineID;

   private double cost;
   private int quantity = 0;

   public Snack(String name, String id, String vendingMachineID, int cost, int quantity) {
      this.name = name;
      this.id = id;
      this.vendingMachineID = vendingMachineID;
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
    * @param vendingMachineID the vendingMachineID to set
    */
   public void setVendingMachineID(String vendingMachineID) {
      this.vendingMachineID = vendingMachineID;
   }

   /**
    * @return the vendingMachineID
    */
   public String getVendingMachineID() {
      return vendingMachineID;
   }

   /**
    * @param quantity the quantity to set
    */
   public void addQuantity(int quantity) {
      this.quantity += quantity;
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