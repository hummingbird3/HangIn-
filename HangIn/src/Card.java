import java.util.ArrayList;

/**
 * Created by USER1 on 30.04.2017.
 */
public class Card {

	private String cardID;
	private String text;
	private int textLimit;
	private Person poster;
	private String posterName;
	private Moment time;
	private TimeScale duration;
	private Moment timePosted;
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

	//CONSTR
	/*
	public Card(String id, Person p) {
		poster = p;
		p.postCard(this);
		cardID = id;
		posterName = poster.getUsername();
		text = "";
		textLimit = 50;
		Now now = new Now();
		timePosted = now;
		time = null;
		hangingPeople = new ArrayList<Person>();
		comingPeople = new ArrayList<Person>();
		visibleGroups = new ArrayList<Group>();
//        length = ; These will be fixed depending on gui
//        width = ; These will be fixed depending on gui
	}
	public Card(String id, Person p, boolean b){
		cardID = id;
		Now now = new Now();
		time = null;
		timePosted = now;
		text = "";
		textLimit = 50;
		hangingPeople = new ArrayList<Person>();
		comingPeople = new ArrayList<Person>();
		visibleGroups = new ArrayList<Group>();
		if ( b) {
			privat = true;
		}
		else{
			poster = p;
			p.postCard(this);
			posterName = poster.getUsername();
		}
//        length = ; These will be fixed depending on gui
//        width = ; These will be fixed depending on gui
	}
	*/
	public Card(Person p) {
		poster = p;
		p.postCard(this);
		Now noa =  new Now();
		cardID = noa.createID("Ca");
		posterName = poster.getUsername();
		text = "";
		textLimit = 50;
		Now now = new Now();
		timePosted = now;
		time = null;
		hangingPeople = new ArrayList<Person>();
		comingPeople = new ArrayList<Person>();
		visibleGroups = new ArrayList<Group>();
//        length = ; These will be fixed depending on gui
//        width = ; These will be fixed depending on gui
	}
	public Card(Person p, Group g){
		Now noa =  new Now();
		cardID = noa.createID("Ca");
		Now now = new Now();
		time = null;
		timePosted = now;
		text = "";
		textLimit = 50;
		hangingPeople = new ArrayList<Person>();
		comingPeople = new ArrayList<Person>();
		visibleGroups = new ArrayList<Group>();
		privat = true;
		posterName = p.getPersonID();
		poster = p;
		visibleGroups.add(g);
//        length = ; These will be fixed depending on gui
//        width = ; These will be fixed depending on gui
	}
	//METHODS

	public String toString() {
		isDone();
		String str = "------------------CARD------------------" + "\n";
		str = str + "CardID: " + cardID + "\n" + "Text: " + text + "\n" + "PosterID: " + poster.getPersonID() + "\n" + "Poster's username: " + posterName + "\n";
		str = str + "Time: " + time.toString() + "\n";
		str = str + "Location: " + location.toString() + "\n" + "Number of hanging: " + numHanging + "\n" + "Number of coming: " + numComing + "\n" + "Private: " + privat + "\n";
		str = str + "Visible groups: ";
		if ( visibleGroups.size() == 0 ){
			str = str + "everyone";
		}
		else {
			for (int i = 0; i < visibleGroups.size(); i++) {
				str = str + visibleGroups.get(i).getName();
				if (i != visibleGroups.size() - 1) {
					str = str + ", ";
				}
			}
		}
		str = str + "\n";
		if ( duration != null ){
			str = str + "Duration: " + getDuration() + "\n";
		}
		str = str + "------------------CARD------------------" + "\n" + "\n";
		return str;
	}
	public String toStringReadable(){
		String str = "";
		str = str + getCardID() + " [" + "Private: " + privat;
		if(privat){
			str = str + " ";
		}
		str = str + " | " + getText() + " | " + getPosterName() + " | " + getLocation() + " | " + getTime() + " | " + getNumHanging() + "]";
		return str;
	}
	public void setText( String s){
		if ( s.length() <= textLimit ) {
			text = s;
		}
		else{
			System.out.println("!!!TEXT TOO LONG CHARACTER LIMIT IS: " + textLimit + "\n");
		}
	}
	public void setCardID( String s ) {
		cardID = s;
	}
	public void setPoster( Person p ) {
		poster = p;
		posterName = p.getUsername();
		p.postCard(this);
	}
	public void setTime( Moment t ) {
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
		privat = true;
	}
	public void removeVisibleGroups( Group g ) {
		visibleGroups.remove(g);
		if (visibleGroups.size() == 0){
			privat = false;
		}
	}
	public void setXi( int i ) {
		xi = i;
	}
	public void setYi( int i ) {
		yi = i;
	}
	public void setDuration( Moment t){
		duration = new TimeScale(time, t);
	}

	public String getText(){
		return text;
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
	public String getDuration(){
		if ( duration != null){
			return duration.toString();
		}
		else{
			return null;
		}
	}
	public Time getTimePosted(){
		return timePosted;
	}
	public int getXi() {
		return xi;
	}
	public int getYi() {
		return yi;
	}

	public boolean isPrivate() {
		return privat;
	}
	public boolean isDone(){
		if ( time == null ){
			System.out.println("no time defined");
			return false;
		}
		else if ( location == null ){
			System.out.println("no location defined");
			return false;
		}
		else if ( poster == null ){
			System.out.println("no poster defined");
			return false;
		}
		else if ( cardID == null ){
			System.out.println("no ID defined");
			return false;
		}
		else {
			return true;
		}
	}



}

