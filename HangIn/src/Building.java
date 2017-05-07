/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Building {
  
  //properties
  int sector;
  int floorNo;
  Area area;
  ArrayList<Card> postedCard;
  int numPosted;
  
  //constructor
  public Building()
  {
    
  }
  
  //get & set methods
  public int getSector()
  {
    return sector;
  }
  
  public int getFloorNo()
  {
    return floorNo;
  }
  
  public Area getArea()
  {
    return area;
  }
  
  public ArrayList<Card> getPostedCard()
  {
    return postedCard;
  }
  
  public int getNumPosted()
  {
    return numPosted;
  }
  
  public void setSector(int sector)
  {
    this.sector = sector;
  }

  public void setFloorNo(int floorNo)
  {
    this.floorNo = floorNo;
  }
  
  public void setArea(Area area)
  {
    this.area = area;
  }
  
  public void setPostedCard(ArrayList<Card> postedCard)
  {
    this.postedCard = postedCard;
  }
  
  public void setNumPosted(int numPosted)
  {
    this.numPosted = numPosted;
  }

}
