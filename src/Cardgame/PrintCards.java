/*
 * Zohaib Kasmani
 * 991545984
 * SYST10199-Web Programming
 */
package Cardgame;
public class PrintCards {
    
    public static void main(String[] args) {
        //gelegates the job to another class generate cards
        //create an object for GenerateCards in order to call the method.
        
        GenerateCards print=new GenerateCards();
        print.generate();//calling method to generate cards
        
        System.out.println("The generated deck");
        for(Cardgame c:print.deck){
            
            System.out.println(c.getSuit()+"  "+c.getValue());
        
        
        
    }
}    
}