package hangin;
/**
 * Location class
 * @author egehatirnaz
 */
public class Location {
    //properties
    int x;
    int y;
    //constructors
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Location(){
        this.x = 0;
        this.y = 0;
    }
    //methods
    /**
     * getX method
     * @return x
     */
    public int getX() {
        return x;
    }
    /**
     * setX method
     * @param x desired x coordinates
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
     * @param y desired y coordinates
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
