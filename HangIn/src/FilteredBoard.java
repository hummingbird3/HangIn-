/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class FilteredBoard {
  
  //properties
  String name;
  
  //constructor
  public FilteredBoard(){
    name = "";
  }
  
  public FilteredBoard(String name){
    this.name = name;
  }
  
  //methods
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
}
