import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSystem {
   
   private ArrayList<Card> deserializedCards;
   private ArrayList<Person> deserializedPerson;
   private ArrayList<Card> cards;
   private ArrayList<Person> person;
   //Lists of data to draw from
   public FileSystem()
   {
      cards = new ArrayList<Card>();
      person = new ArrayList<Person>();
   }

   
   //Method to create all cards
   public void inputCard(Card card)
   {
      cards.add(card); 
      saveCardsData();
   }
   
   //Method to create all person
   public void inputPerson(Person p)
   {
      person.add(p);
      savePersonData();
   }
   
   //Serialize data, SAVE WHEN QUITTING I GUESS
   public void savePersonData()
   {
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
   
      public void saveCardsData()
      {
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
   
   //Deserialize data, LOAD WHEN STARTING I GUESS
   public void loadCardsData()
   {
      deserializedCards = new ArrayList<Card>();  
      try {
         FileInputStream fileIn = new FileInputStream("dataCards.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         deserializedCards = (ArrayList<Card>)in.readObject();
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
      deserializedPerson = new ArrayList<Person>();
      
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
   