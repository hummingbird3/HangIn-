import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSystem {
   
   //Lists of data to draw from
   ArrayList<Card> cards = new ArrayList<Card>();
   ArrayList<Person> person = new ArrayList<Person>();

   
   //Method to create all cards
   public void inputCards(){
      cards.add(new Card("1", person.get(0)));    
      cards.add(new Card("2", person.get(1))); 
   }
   
   //Method to create all person
   public void inputPerson(){
      person.add(new Person("1", "irfan", "tekin"));
      person.add(new Person("2", "brfan", "dekin"));
   }
   
   //Serialize data
   public void savePersonData(){
      //Massive object to store all our objects
      
      try {
         FileOutputStream fileOut = new FileOutputStream("dataPerson.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(person);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in data.ser");
         
      } catch(IOException i){
         i.printStackTrace();
      }
   }
   
      public void saveCardsData(){
      
      try {
         FileOutputStream fileOut = new FileOutputStream("dataCards.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(cards);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in data.ser");
         
      } catch(IOException i){
         i.printStackTrace();
      }
   }
   
   //Deserialize data
   public void loadCardsData()
   {
      //create arraylist to store deserialized objects
      ArrayList<Object> deserializedCards = new ArrayList<Object>();
      
      try {
         FileInputStream fileIn = new FileInputStream("dataCards.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         deserializedCards = (ArrayList<Object>)in.readObject();
         in.close();
         fileIn.close();
      } catch(IOException i){
         i.printStackTrace();
         return;
      } catch(ClassNotFoundException c){
         c.printStackTrace();
         return;
      }

   }
   
   public void loadPersonData()
   {
      //create arraylist to store deserialized objects
      ArrayList<Person> deserializedPerson = new ArrayList<Person>();
      
      try {
         FileInputStream fileIn = new FileInputStream("dataPerson.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         deserializedPerson = (ArrayList<Person>)in.readObject();
         in.close();
         fileIn.close();
      } catch(IOException i){
         i.printStackTrace();
         return;
      } catch(ClassNotFoundException c){
         c.printStackTrace();
         return;
      }
   }     
}
   
