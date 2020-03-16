package snackbar;

public class VendingMachine {
   private String id;
   private String name;

   public VendingMachine(String name, String id) {
      this.name = name;
      this.id = id;
   }

   /**
    * @return the id
    */
   public String getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id) {
      this.id = id;
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }
}