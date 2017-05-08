/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class MainBoard {
  
  //properties 
  boolean specTime;
  Time time;
  
  //constructor
  public MainBoard()
  {
    specTime = true;
    time = t - 2400;
  }
  
  //methods
  public boolean getSpecTime()
  {
    return specTime;
  }
  
  public Time getTime()
  {
    return time;
  }
  
  public void setSpecTime(boolean specTime)
  {
    this.specTime = specTime;
  }
  
  public void setTime(Time time)
  {
    this.time = time;
  }
}
