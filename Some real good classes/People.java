import java.util.ArrayList;

/**
 * A simple Java class!
 */
public class People
{
   // properties

   String name;
   String surname;
   String nickname;
   String id; // yes, string.
   ArrayList<Cards> accepted;
   int numAccepted;
   ArrayList<Cards> posted;
   int numPosted;
   ArrayList<Cards> nearby;
   int numNearby;
   Srs srs;
   
   // constructors
   
   public People(String name, String surname) {}
   
   public People(String nickname) {}
   
   // methods

   /**
    * !!! add get methods for all variables !!!
    * @return the values as they are.
    */
   
   /**
    * a method that connects the person with srs no idea how.
    * @param Srs x, its parameter is an Srs object.
    */
   
   /**
    * a method that changes the name and surname. It is only needed to create Student class wont be used for anything else.
    * @param String x, a new name,
    * @param String y, a new surname,
    */
   public void nameChange( String x, String y)
   {
      name = x;
      surname = y;
   }
   
   /**
    * a method that changes the nickname. It is only needed to create Student class wont be used for anything else.
    * @param String a new nickname,
    */
   public void nameChange( String x)
   {
      nickname = x;
   }
   
}