import java.util.*;

/**
 * Created by USER1 on 30.04.2017.
 */
public class Card {

    // properties

    String poster;
    Time time;
    Area location;
    int numHanging;
    ArrayList<Person> hangingPeople;
    int numComing;
    ArrayList<Person> comingPeople;
    boolean privateAccount;
    Group visibleGroups;


    // constructors

    // methods
    public String getPoster()
    {
        return poster;
    }
    
    public Time getTime()
    {
        return time;
    }
    
    public Area getLocation()
    {
        return location;
    }
    
    public int getNumHanging()
    {
        return numHanging;
    }
    
    public ArrayList<Person> getHangingPeople()
    {
        return hangingPeople;
    }
    
    public int getNumComing()
    {
        return numComing;
    }
    
    public ArrayList<Person> getComingPeople()
    {
        return comingPeople;
    }
    
    public boolean getPrivateAccount()
    {
        return PrivateAccount;
    }
    
    public Group getVisibleGroups()
    {
        return visibleGroups;
    }
    
    public void setPoster(String poster)
    {
        this.poster = poster;
    }
    
  
    public void setTime(Time time)
    {
        this.time = time;
    }
    
    public void (Area location)
    {
        this.location = location;
    }
    
    public void (int numHanging)
    {
        this.numHanging = numHanging;
    }
    
    public void (ArrayList<Person> hangingPeople)
    {
        this.hangingPeople = hangingPeople;
    }
    
    public void (int numComing)
    {
        this.numComing = numComing;
    }
    
    public void (ArrayList<Person> comingPeople)
    {
        this.comingPeople = comingPeople;
    }
    
    public void (boolean privateAccount)
    {
        this.privateAccount = privateAccount;
    }
    
    public void (Group visibleGroups)
    {
        this.visibleGroups = visibleGroups;
    }    
}
