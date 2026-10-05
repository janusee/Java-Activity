
package activity.pkg1.in.java;


public class Advance1 {
    
     public static void main(String[] args){
    
    double centimeters = 350.73;
    int wholemeters = (int)centimeters /100;
    double remainingcenti = centimeters %100;
    
         System.out.println("Centimeters: "+ centimeters);
         System.out.println("Remaing Centimeters: "+ remainingcenti);
         
          //int to double is automatic widening
         int x = 10;
         double y = x;
         
         System.out.println("Implicit Widening: "+ y);
         
         //double to int needs casting and loses decimals
         double a = 15.75;
         int b = (int)a;
         
         System.out.println("Explicit Narrowing; "+ b);
        
}
}