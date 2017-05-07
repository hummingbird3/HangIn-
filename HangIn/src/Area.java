/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Area {
}

  //properties
  String name;
  int x;
  int y;
  int width;
  int height;
  
  //constructor
  
  //builds an Area with any default information
  public Area() {
    name = null;
    x = 0;
    y = 0;
    width = 0;
    height = 0;
   
  }

 
  
  public String getName()
  {
    return name;
  }
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  }

  public String getWidth()
  {
    return width;
  }


  public String getHeight()
  {
    return height;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setX(int x)
  {
    this.x = x;
  }
  
  public void setY(int y)
  {
    this.x = x;
  }

  public void setWidth(int width)
  {
    this.width = width;
  }

  public void setHeight(int height)
  {
    this.height = height;
  }
}
