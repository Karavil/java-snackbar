package snackbar;

public class Customer {
   private String id;
   private String name;

   private double dollars = 0.0;

   public Customer(String name, String id, double startingCash) {
      this.id = id;
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