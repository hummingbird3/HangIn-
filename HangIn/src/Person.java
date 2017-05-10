/**
 * Created by Enes Yıldırım, Burak Korkmaz on 30.04.2017.
 */
import java.util.ArrayList;

public class Person
{

    //properties
    private String personID;
    private String name;
    private String surname;
    private String username;
    private boolean verified;
    private boolean privateAccount;
    private ArrayList<Card> postedCards;
    private int numPosted;
    private ArrayList<Card> acceptedCards;
    private int numAccepted;
    private ArrayList<Card> attendedCards;
    private int numAttended;
    private ArrayList<Group> groups;

    //CONTR
    /*
    public Person(String id, String name, String surname) {
        postedCards = new ArrayList<Card>();
        acceptedCards = new ArrayList<Card>();
        attendedCards = new ArrayList<Card>();
        personID = id;
        this.name = name;
        this.surname = surname;
        username = name + " " + surname;
        verified = false;
        privateAccount = false;
        //postedCards = null;
        numPosted = 0;
        //acceptedCards = null;
        numAccepted = 0;
        //attendedCards = null;
        numAttended = 0;
        groups = new ArrayList<Group>();
    }
    public Person(String id, String name, String surname, String uname) {
        postedCards = new ArrayList<Card>();
        acceptedCards = new ArrayList<Card>();
        attendedCards = new ArrayList<Card>();
        personID = id;
        this.name = name;
        this.surname = surname;
        this.username = uname;
        verified = false;
        privateAccount = true;
        //postedCards = null;
        numPosted = 0;
        //acceptedCards = null;
        numAccepted = 0;
        //attendedCards = null;
        numAttended = 0;
        groups = new ArrayList<Group>();
    }
    */
    public Person(String name, String surname, String uname) {
        postedCards = new ArrayList<Card>();
        acceptedCards = new ArrayList<Card>();
        attendedCards = new ArrayList<Card>();
        Now noa =  new Now();
        personID = noa.createID("Pe");
        this.name = name;
        this.surname = surname;
        this.username = uname;
        verified = false;
        privateAccount = true;
        //postedCards = null;
        numPosted = 0;
        //acceptedCards = null;
        numAccepted = 0;
        //attendedCards = null;
        numAttended = 0;
        groups = new ArrayList<Group>();
    }

    public Person(String name, String surname) {
        postedCards = new ArrayList<Card>();
        acceptedCards = new ArrayList<Card>();
        attendedCards = new ArrayList<Card>();
        Now noa =  new Now();
        personID = noa.createID("Pe");
        this.name = name;
        this.surname = surname;
        username = name + " " + surname;
        verified = false;
        privateAccount = false;
        //postedCards = null;
        numPosted = 0;
        //acceptedCards = null;
        numAccepted = 0;
        //attendedCards = null;
        numAttended = 0;
        groups = new ArrayList<Group>();
    }

    //METHODS

    public String toString(){
        String str = "------------------PERSON----------------" + "\n";
        str = str + "PersonID: " + personID + "\n" + "Name: " + name + "\n" + "Surname: " + surname + "\n" + "Username: " + username + "\n";
        str = str + "Verified: " + verified + "\n" + "Private account: " + privateAccount + "\n";
        str = str + "Number of posted: " + numPosted + "\n" + "Number of accepted: " + numAccepted + "\n" + "Number of attended: " + numAttended + "\n";
        str = str + "Posted Cards: ";
        for ( int i = 0; i < postedCards.size(); i++) {
            str = str + postedCards.get(i).getCardID();
            if ( i != postedCards.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "Accepted Cards: ";
        for ( int i = 0; i < acceptedCards.size(); i++) {
            str = str + acceptedCards.get(i).getCardID();
            if ( i != acceptedCards.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "Attended Cards: ";
        for ( int i = 0; i < attendedCards.size(); i++) {
            str = str + attendedCards.get(i).getCardID();
            if ( i != attendedCards.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "Groups: ";
        for ( int i = 0; i < groups.size(); i++) {
            str = str + groups.get(i).getGroupID() + "[" + groups.get(i).getName() + "]";
            if ( i != groups.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "------------------PERSON----------------" + "\n" + "\n";
        return str;
    }

    public void postCard(Card x) {
        boolean alreadyPosted = false;
        for ( Card c : postedCards ){
            if (c.getCardID().equals(x.getCardID())){
                alreadyPosted = true;
                System.out.println("!!!already posted the card: " + x.getCardID() + "\n");
            }
        }
        if ( alreadyPosted == false) {
            postedCards.add(x);
            acceptedCards.add(x);
            numPosted = postedCards.size();
            numAccepted = acceptedCards.size();
        }
    }
    public void removePostedCard(Card x){
        postedCards.remove(x);
        numPosted = postedCards.size();
    }
    public void acceptCard(Card x) {
        acceptedCards.add(x);
        numAccepted = acceptedCards.size();
    }
    public void removeAcceptedCard(Card x){
        acceptedCards.remove(x);
        numAccepted = acceptedCards.size();
    }
    public void AttendCard(Card x){ // MIGHT REMOVE DIS
        attendedCards.add(x);
        numAttended = attendedCards.size();
    }
    public void removeAttendedCard(Card x){
        attendedCards.remove(x);
        numAttended = attendedCards.size();
    }
    public void addGroup(Group g){
        groups.add(g);
    }
    public void removeGroup(Group g){
        groups.remove(g);
    }

    public String getPersonID(){
        return personID;
    }
    public void setPersonID(String s){
        personID = s;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n) {
        this.name = n;
        if (  !privateAccount ){
            username = name + " " + surname;
        }
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String sname) {
        this.surname = sname;
        if (  !privateAccount ){
            username = name + " " + surname;
        }
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public ArrayList<Card> getPostedCards()
    {
        return postedCards;
    }
    public void setPostedCards(ArrayList<Card> postedCards)
    {
        this.postedCards = postedCards;
    }
    public ArrayList<Card> getAcceptedCards()
    {
        return acceptedCards;
    }
    public void setAcceptedCards(ArrayList<Card> acceptedCards)
    {
        this.acceptedCards = acceptedCards;
    }
    public boolean getVerified()
    {
        return verified;
    }
    public void setVerified(boolean b)
    {
        verified = b;
    }
    public ArrayList<Card> getAttendedCards()
    {
        return attendedCards;
    }
    public void setAttendedCards(ArrayList<Card> attendedCards)
    {
        this.attendedCards = attendedCards;
    }
    public boolean getPrivate()
    {
        return privateAccount;
    }
    public void setPrivate(boolean privateAccount)
    {
        this.privateAccount = privateAccount;
    }
    public int getNumPosted()
    {
        return numPosted;
    }
    public void setNumPosted(int numPosted)
    {
        this.numPosted = numPosted;
    }
    public int getNumAccepted()
    {
        return numAccepted;
    }
    public void setAcceptedPosted(int numAccepted)
    {
        this.numAccepted = numAccepted;
    }
    public int getNumAttended()
    {
        return numAttended;
    }
    public void setNumAttended(int numAttended)
    {
        this.numAttended = numAttended;
    }


}
