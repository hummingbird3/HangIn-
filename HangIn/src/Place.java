/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Place {
  
  int sector;
  Area area;
  ArrayList<Card> postedCards;
  int numPosted;
  
  public Place(){
    
  }
  
  public int getSector(){
    return sector;
  }
  
  public Area getArea(){
    return area;
  }
  
  public ArrayList<Card> getPostedCards(){
    return postedCards;
  }
  
  public int getNumPosted(){
    return numPosted;
  }
  
  public void setSector(int sector){
    this.sector = sector;
  }
  
  public void setArea(Area area){
    this.area = area ;
  }
  
  public void setPostedCards(ArrayList<Card> postedCards){
    this.postedCards = postedCards;
  }
  
  public void setNumPosted(int numPosted){
    this.numPosted = numPosted;
  }
}
