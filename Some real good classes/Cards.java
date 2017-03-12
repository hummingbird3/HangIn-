import java.util.ArrayList;

/**
 * A simple Java class!
 */
public class Cards
{
   // properties
   
   Locations where;
   Boolean status; // private = true, public = false;
   ArrayList<People> visibleTo; // if it is restricted for a certain club. if status is true.
   ArrayList<People> hanging;
   int numHanging;
   ArrayList<People> coming;
   int numComing; 
   ArrayList<Extras> extras; // like food, or upcoming exam warning
   Extras importantExtra; // we cannot show all the extras on the card! it will be like "Dominos pizza and more!" if importantExtra is dominos.
   String text; // 50 characters
   int popularity; // depending on how many people coming
  
   // constructors
   
   // methods
   
   /**
    * !!! add get methods for all variables !!!
    * @return the values as they are.
    */
   
   
}