package hangin;
/**
 * Created by "Aegis" on 30.04.2017.
 */
public class Area {
    //properties
    String name;
    int x;
    int y;
    int width;
    int height;
    
    //constructors
    public Area(String name, int x, int y, int width, int height){
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //methods
    /**
     * getName method
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * setName method
     * @param name label of area 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getX method
     * @return x
     */
    public int getX() {
        return x;
    }
    /**
     * setX method
     * @param x east starting point
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * getY method
     * @return y
     */
    public int getY() {
        return y;
    }
    /**
     * setY method
     * @param y south starting point
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * getWidth method
     * @return width
     */
    public int getWidth() {
        return width;
    }
    /**
     * setWidth method
     * @param width width of area
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * getHeight method
     * @return height
     */
    public int getHeight() {
        return height;
    }
    /**
     * setHeight method
     * @param height height of area 
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
}
