import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by USER1 on 30.04.2017.
 */
public class CardHolder {
	ArrayList<Card> allCards;
	int idCount;
	Person unknown;
	int i;
	DecimalFormat decimalFormat;

	public CardHolder(){
		allCards = new ArrayList<Card>();
		unknown = new Person("unknown","person","UNKNOWN");
		decimalFormat = new DecimalFormat("0000");
	}

	public String toString(){
	 	String str = "---------------ALLCARDS-----------------" + "\n";
		i = 00000;
		for ( Card c : allCards ){
			i++;
			str = str + i + ")" + " " + c.toStringReadable() + "\n";
		}
		str = str + "---------------ALLCARDS-----------------" + "\n" + "\n";
		return str;
	}
	public void newCard(Person poster, String t, Moment m, Building b){
		Card x = new Card( poster);
		x.setText(t);
		x.setTime(m);
		x.setLocation(b);
		i++;
		x.setCardID(decimalFormat.format(i));
		if ( x.isDone()){
			allCards.add(x);
		}
		else{
			System.out.println("!!!NOT DONE");
		}
	}
	public void newCard(Person poster, String t, Moment m, Building b, Group g){
		Card x = new Card( poster, g);
		x.setText(t);
		x.setTime(m);
		x.setLocation(b);
		x.setPoster(unknown);
		i++;
		x.setCardID(decimalFormat.format(i));
		if ( x.isDone()){
			allCards.add(x);
		}
		else{
			System.out.println("!!!NOT DONE");
		}
	}
	public void removeCard(String id){
		if ( findByID(id) != null ) {
			allCards.remove(findByID(id));
		}
		else {
			System.out.println("!!!NO CARD BY THAT ID");
		}
	}
	public void removeCard(int i){
		if ( i <= allCards.size() ){
			allCards.remove(i);
		}
		else {
			System.out.println("!!!INDEX OUT OF BOUNDARY");
		}
	}
	public Card findByID( String id){
		for ( Card c : allCards ){
			if ( c.getCardID().equals(id)){
				return c;
			}
		}
		return null;
	}
	public Card getCard(int i){
		return allCards.get(i-1);
	}


}
