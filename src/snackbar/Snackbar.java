package snackbar;

public class Snackbar {
   public static void main(String[] args) {
      Customer Jane = new Customer("Jane", 45.25);
      Customer Bob = new Customer("Bob", 33.14);

      VendingMachine food = new VendingMachine("Food", "food");
      VendingMachine drink = new VendingMachine("Drink", "drink");
      VendingMachine office = new VendingMachine("Office", "office");

      Snack chips = new Snack("Chips", food, 1.75, 36);
      Snack chocolateBar = new Snack("Chocolate Bar", food, 1.00, 36);
      Snack pretzel = new Snack("Pretzel", food, 2.00, 30);

      Snack soda = new Snack("Soda", drink, 2.50, 24);
      Snack water = new Snack("Water", drink, 2.75, 20);

      System.out.println("\nJane has $" + Jane.getCash() + " on hand.");
      System.out.println("There is/are " + soda.getQuantity() + " soda/s in the vending machine.\n");

      Jane.removeCash(soda.getCost(3));
      soda.removeQuantity(3);

      System.out.println("Jane bought 3 sodas, and has $" + Jane.getCash() + " left.");
      System.out.println("There is/are now " + soda.getQuantity() + " soda/s left in the vending machine.\n");

   }
}