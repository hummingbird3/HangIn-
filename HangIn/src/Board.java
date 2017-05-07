/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Board {
  
  
  //properties
  String name;
  ArrayList<Card>  postedCards;
  
  //constructor
  
  //builds a Board with any default information
  public Board() {
    name = null;
    postedCards = null;
  }
  
  //methods
  public void addPostedCards(Card x)
  {
    postedCards.add(x);
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getPostedCards()
  {
    return postedCards.toString();
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setPostedCards(ArrayList<Cards> postedCards)
  {
    this.postedCards = postedCards;
  }
}
