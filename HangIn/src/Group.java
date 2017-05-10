/**
 * Created by Enes Yıldırım, Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Group {

    //properties
    String groupID;
    String name;
    String info;
    int infoLimit;
    Boolean privat;
    ArrayList<Person> members;
    ArrayList<Person> coordinators;
    ArrayList<Card> postedCards;
    int numPosted;

    //constructor
    /*
    public Group(String id, String n){
        groupId = id;
        name = n;
        info = "no info";
        infoLimit = 100;
        privat = false;
        numPosted = 0;
        members = new ArrayList<Person>();
        coordinators = new ArrayList<Person>();
        postedCards = new ArrayList<Card>();
    }
    public Group(String id, String n, String i){
        groupId = id;
        name = n;
        infoLimit = 100;
        if (i.length() <= infoLimit ) {
            info = i;
        }
        privat = false;
        numPosted = 0;
        members = new ArrayList<Person>();
        coordinators = new ArrayList<Person>();
        postedCards = new ArrayList<Card>();
    }
    */
    public Group(String n){
        Now noa =  new Now();
        groupID = noa.createID("Gr");
        name = n;
        info = "no info";
        infoLimit = 100;
        privat = false;
        numPosted = 0;
        members = new ArrayList<Person>();
        coordinators = new ArrayList<Person>();
        postedCards = new ArrayList<Card>();
    }

    public Group(String n, String i){
        Now noa =  new Now();
        groupID = noa.createID("Gr");
        name = n;
        infoLimit = 100;
        if (i.length() <= infoLimit ) {
            info = i;
        }
        privat = false;
        numPosted = 0;
        members = new ArrayList<Person>();
        coordinators = new ArrayList<Person>();
        postedCards = new ArrayList<Card>();
    }
    //methods

    public String toString(){
        String str = "------------------GROUP-----------------" + "\n";
        str = str + "GroupID: " + groupID + "\n" + "Name: " + name + "\n" + "Info: " + info + "\n" + "Private: " + privat + "\n";
        str = str + "Number of members: " + members.size() + "\n";
        str = str + "Number of cards: " + numPosted + "\n" + "Posted Cards: ";
        for ( int i = 0; i < postedCards.size(); i++) {
            str = str + postedCards.get(i).getCardID();
            if ( i != postedCards.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "Members: ";
        for ( int i = 0; i < members.size(); i++) {
            str = str + members.get(i).getPersonID() + "[" + members.get(i).getUsername() + "]";
            if ( i != members.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "Coordinators: ";
        for ( int i = 0; i < coordinators.size(); i++) {
            str = str + coordinators.get(i).getPersonID() + "[" + coordinators.get(i).getUsername() + "]";
            if ( i != coordinators.size()-1 ){
                str = str + ", ";
            }
        }
        str = str + "\n";
        str = str + "------------------GROUP-----------------" + "\n" + "\n";
        return str;
    }

    public boolean isMember(Person p){
        for ( Person pe : members){
            if ( pe == p ){
                return true;
            }
        }
        return false;
    }
    public boolean isCoordinator(Person p){
        for ( Person pe : coordinators){
            if ( pe == p ){
                return true;
            }
        }
        return false;
    }

    public void addMember(Person p){
        if (isMember(p)){
            System.out.println("Already a member");
        }
        else {
            members.add(p);
            p.addGroup(this);
        }
    }
    public void removeMember(Person p){
        if (isCoordinator(p)){
            removeCoordinator(p);
            members.remove(p);
            p.removeGroup(this);
        }
        else {
            members.remove(p);
            p.removeGroup(this);
        }
    }
    public void addCoordinator(Person p){
        if (isCoordinator(p)){
            System.out.println("Already a coordinator");
        }
        else if (isMember(p)) {
            coordinators.add(p);
        }
        else {
            addMember(p);
            coordinators.add(p);
        }
    }
    public void removeCoordinator(Person p){
        coordinators.remove(p);
    }

    public String getGroupID(){
        return groupID;
    }
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
    public void setInfo(String info) {
        if (info.length() <= infoLimit ) {
            this.info = info;
        }
        else{
            System.out.println("!!!INFO TOO LONG MAX CHARACTER: " + infoLimit);
        }
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
    public void setPostedCard(ArrayList<Card> postedCards)
    {
        this.postedCards = postedCards;
    }
    public void setNumPosted(int numPosted)
    {
        this.numPosted = numPosted;
    }

}
