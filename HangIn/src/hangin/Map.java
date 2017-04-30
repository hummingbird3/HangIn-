package hangin;
/**
 * Created by "Aegis" on 30.04.2017.
 */
import java.util.ArrayList;
public class Map {
    
    //properties
    ArrayList<Area> areas;
    ArrayList<Card> cards;
    MyLocation myLocation;
    
    //constructor
    public Map() {
        areas = new ArrayList<Area>();
        cards = new ArrayList<Card>();
    }
    
    public Map(ArrayList<Area> areas, ArrayList<Card> cards, MyLocation myLocation) {
        this.areas = areas;
        this.cards = cards;
        this.myLocation = myLocation;
    }
    
    //methods
    /**
     * addArea method
     * @param A desired area
     */
    public void addArea(Area A){
        areas.add(A);
    }
    /**
     * addCard method
     * @param x card to add
     */
    public void addCard(Card x){
        cards.add(x);
    }
    /**
     * getMyLocation method
     * @return myLocation
     */
    public MyLocation getMyLocation() {
        return myLocation;
    }
    /**
     * setMyLocation method
     * @param myLocation a MyLocation 
     */
    public void setMyLocation(MyLocation myLocation) {
        this.myLocation = myLocation;
    }
}
