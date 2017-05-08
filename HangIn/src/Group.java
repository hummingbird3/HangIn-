/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Group {
  
  //properties
  String name;
  String info;
  Boolean privat;
  ArrayList<Person> members;
  ArrayList<Person> coordinators;
  ArrayList<Card> postedCards;
  int numPosted;
  
  //constructor
  public Group(){
    
  }
  
  //methods
  public String getName()
  {
    return name;
  }
  
  public String getInfo()
  {
    return info;
  }
  
  public Boolean getPrivate()
  {
    return privat;
  }
  
  public ArrayList<Person> getMembers()
  {
    return members;
  }
  
  public ArrayList<Person> getCoordinators()
  {
    return coordinators;
  }
  
  public ArrayList<Card> getPostedCard()
  {
    return postedCards;
  }
  
  public int getNumPosted()
  {
    return numPosted;
  }
  
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setInfo(String info)
  {
    this.info = info;
  }
  
  public void setPrivate(Boolean privat)
  {
    this.privat = privat;
  }
  
  public void setMembers(ArrayList<Person> members)
  {
    this.members = members;
  }
  
  public void setCoordinators(ArrayList<Person> coordinators)
  {
    this.coordinators = coordinators;
  }
  
  public void setPostedCard(ArrayList<Card> postedCard)
  {
    this.postedCards = postedCards;
  }
  
  public void setNumPosted(int numPosted)
  {
    this.numPosted = numPosted;
  }
  
}
