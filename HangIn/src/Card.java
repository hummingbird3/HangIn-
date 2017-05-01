import java.util.*;

/**
 * Created by USER1 on 30.04.2017.
 */
public class Card {

    // properties

    private String cardID;
    private Person poster;
    private String posterName;
    private Time time;
    private Area location;
    private int numHanging;
    private ArrayList<Person> hangingPeople;
    private int numComing;
    private ArrayList<Person> comingPeople;
    private boolean privat;
    private ArrayList<Group> visibleGroups;
    private int xi; // for gui
    private int yi; // for gui
    private int length; // for gui
    private int width; // for gui

    // constructors

    public Card() {

        hangingPeople = new ArrayList<Person>();
        comingPeople = new ArrayList<Person>();
        visibleGroups = new ArrayList<Group>();
//        length = ; These will be fixed depending on gui
//        width = ; These will be fixed depending on gui
    }

    // methods

    public String toString() {
        String str = "";
        str = str + "CardID: " + cardID + "\n" + "PosterID: " + poster.getPosterID() + "\n" + "Poster's username: " + posterName + "\n" + "Time: " + time.toString() + "\n";
        str = str + "Location: " + location.toString() + "\n" + "Number of hanging: " + numHanging + "\n" + "Number of coming: " + numComing + "\n" + "Private: " + privat + "\n";
        str = str + "Visible groups: ";
        for ( int i = 0; i < visibleGroups.size(); i++) {
            str = str + visibleGroups.get(i).getName();
            if ( i != visibleGroups.size()-1 ){
                str = str + ", ";
            }
        }
        return str;
    }

    public void setCardID( String s ) {
        cardID = s;
    }
    public void setPoster( Person p ) {
        poster = p;
//        posterName = p.getUserName();
    }
    public void setTime( Time t ) {
        time = t;
    }
    public void setLocation( Area a ) {
        location = a;
    }
    public void addHangingPeople( Person p ) {
        hangingPeople.add(p);
        numHanging = hangingPeople.size();
    }
    public void removeHangingPeople( Person p ) {
        hangingPeople.remove(p);
        numHanging = hangingPeople.size();
    }
    public void addComingPeople( Person p ) {
        comingPeople.add(p);
        numHanging = comingPeople.size();
    }
    public void removeComingPeople( Person p ) {
        comingPeople.remove(p);
        numHanging = comingPeople.size();
    }
    public void setPrivate( boolean b ) {
        privat = b;
    }
    public void addVisibleGroups( Group g ) {
        visibleGroups.add(g);
    }
    public void removeVisibleGroups( Group g ) {
        visibleGroups.remove(g);
    }
    public void setXi( int i ) {
        xi = i;
    }
    public void setYi( int i ) {
        yi = i;
    }

    public String getCardID(){
        return cardID;
    }
    public Person getPoster() {
        return poster;
    }
    public String getPosterName() {
        return posterName;
    }
    public Time getTime() {
        return time;
    }
    public Area getLocation() {
        return location;
    }
    public int getNumHanging() {
        return numHanging;
    }
    public int getNumComing() {
        return numComing;
    }
    public ArrayList<Person> getHangingPeople() {
        return hangingPeople;
    }
    public ArrayList<Person> getComingPeople() {
        return comingPeople;
    }
    public ArrayList<Group> getVisibleGroups() {
        return visibleGroups;
    }
    public boolean isPrivate() {
        return privat;
    }
    public int getXi() {
        return xi;
    }
    public int getYi() {
        return yi;
    }



}
