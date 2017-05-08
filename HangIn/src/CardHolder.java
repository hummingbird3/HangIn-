/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class CardHolder {
  
  //properties
  ArrayList<Card> cards;
  
  //constructor
  public CardHolder()
  {
    cards = null;
  }
  
  //methods
  public void addCard(Card x)
  {
    cards.add(x);
  }
  
  public ArrayList<Card> getCards()
  {
    return cards;
  }
}
