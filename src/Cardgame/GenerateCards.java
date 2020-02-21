/*
 * Zohaib Kasmani
 * 991545984
 * SYST10199-Web Programming
 */
package Cardgame;

/**
 *
 * @author Taby zeri
 */
public class GenerateCards 
{
    public int numberofcards=56;
    Cardgame []deck=new Cardgame [numberofcards];//array of objects

    
    //store 52 cards in an array after generating it 
        public void generate(){
            int count=0;
            for(Cardgame.Suit temp1:Cardgame.Suit.values())//for reading enum suits//method used to access all the values of suits i.e enums
            {      
                
            
                for(Cardgame.Value temp2:Cardgame.Value.values())//for reading enum value 
                {
                   Cardgame c1= new Cardgame(temp1,temp2);//can use it bcoz of constructors.
                    deck[count]=c1;
                    count++;
                }}



    
}
}
