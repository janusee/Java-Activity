
package activity.pkg1.in.java;


public class intermediate {
    
    public static void main(String[] args){
    
     int quantity = 3;
     double unitPrice = 179.99;
     String storename = "Rene Store";
     
     double total = quantity * unitPrice;
     
     System.out.println("Store Name; " + storename);
     System.out.println("Quantity: " + quantity);
     System.out.println("Unit Price: " + unitPrice);
     System.out.println("Total: " + total);
        
        // total cost cannot declare as an int because total cost have some decimal values 
        // if we use int for that, it can be inaccurate since decimal values is important 
    }
}
   



    