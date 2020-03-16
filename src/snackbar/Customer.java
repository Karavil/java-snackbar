package snackbar;

public class Customer {
   private static int counter = 0;
   private int id;
   private String name;

   private double dollars = 0.0;

   public Customer(String name, double startingCash) {
      this.id = counter++;
      this.name = name;
      this.dollars = startingCash;
   }

   /**
    * @return the dollars
    */
   public double getCash() {
      return dollars;
   }

   /**
    * Add money (dollars) into Customer object
    * 
    * @param dollars
    */
   public void addCash(double dollars) {
      this.dollars += dollars;
   }

   /**
    * Remove money (dollars) from Customer object
    * 
    * @param dollars
    */
   public void removeCash(double dollars) {
      this.dollars -= dollars;
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
}