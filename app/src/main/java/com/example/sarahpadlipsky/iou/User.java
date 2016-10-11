/**
 * Represents a user of the IOU app.
 * @author cesiu
 * @version October 10, 2016
 */

public class User {
   // The name of the user
   private String name;
   // The amount of money the user has paid
   private double moneySpent;
   // The amount of money the user still owes
   private double moneyOwed;

   public User() {
   }

   /**
    * @return The name of the user
    */
   public String getName() {
      return name;
   }

   /**
    * @param name The new name of the user
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * @return The amount of money the user has paid
    */
   public double getMoneySpent() {
      return moneySpent;
   }

   /**
    * @param money The new amount of money the user has paid
    */
   // TODO: Should the parameter be "moneySpent" for symmetry's sake?
   public void setMoneySpent(double money) {
      moneySpent = money;
   }

   /**
    * @return The amount of money the user still owes
    */
   public double getMoneyOwed() {
      return moneyOwed;
   }

   /**
    * @param The new amount of money the user still ows
    */
   public void setMoneyOwed(double moneyOwed) {
      this.moneyOwed = moneyOwed;
   }
}
