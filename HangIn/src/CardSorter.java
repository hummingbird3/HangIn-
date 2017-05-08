/**
 * Created by Burak Korkmaz on 08.05.2017.
 */
import java.util.*;

public class CardSorter {
  
  //properties
  AllCards all;
  ArrayList<Card> allCards;
  boolean specTime;
  Time time;
  boolean specLocation;
  Location location;
  boolean specArea;
  Area area;
  boolean specMinCount;
  int minCount;
  boolean specMaxCount;
  int maxCount;
  ArrayList<Card> sortedCards;
  
  //constructor
  public CardSorter(){
    
    
  }
  
  //get & set methods
  
  public AllCards getAll()
  {
    return all;
  }
  
  public ArrayList<Card> getAllCards()
  {
    return allCards;
  }
  
  public boolean getSpecTime()
  {
    return specTime;
  }
  
  public Time getTime()
  {
    return time;
  }
  
  public boolean getSpecLocation()
  {
    return specLocation;
  }
  
  public Location getLocation()
  {
    return location;
  }
  
  public boolean getSpecArea()
  {
    return specArea;
  }
  
  public Area getArea()
  {
    return area;
  }
  
  public boolean getSpecMinCount()
  {
    return specMinCount;
  }
  
  public int getMinCount()
  {
    return minCount;
  }
  
  public boolean getSpecMaxCount()
  {
    return specMaxCount;
  }
  
  public int getMaxCount()
  {
    return maxCount;
  }
  
  public ArrayList<Card> getSortedCards()
  {
    return sortedCards;
  }
  
   public void setAll(AllCards all)
  {
    this.all = all;
  }
  
  public void setAllCards(ArrayList<Card> allCards)
  {
    this.allCards = allCards;
  }
  
  public void setSpecTime(boolean specTime)
  {
    this.pecTime = specTime;
  }
  
  public void setTime(Time time)
  {
    this.time = time;
  }
  
  public void setSpecLocation(boolean specLocation)
  {
    this.specLocation = specLocation;
  }
  
  public void setLocation(Location location)
  {
    this.location = location;
  }
  
  public void setSpecArea(boolean specArea)
  {
    this.specArea = specArea;
  }
  
  public void setArea(Area area)
  {
    this.area = area;
  }
  
  public void setSpecMinCount(boolean specMinCount)
  {
    this.specMinCount = specMinCount;
  }
  
  public void setMinCount(int minCount)
  {
    this.minCount = minCount;
  }
  
  public void setSpecMaxCount(boolean specMaxCount)
  {
    this.specMaxCount = specMaxCount;
  }
  
  public void setMaxCount(int maxCount)
  {
    this.maxCount = maxCount;
  }
  
  public void setSortedCards(ArrayList<Card> sortedCards)
  {
    this.sortedCards = sortedCards;
  }
}
