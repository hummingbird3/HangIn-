/**
 * Created by Burak Korkmaz on 30.04.2017.
 */
import java.util.*;

public class Person
{
  
  //properties
  String name;
  String surname;
  String nickname;
  boolean verified;
  boolean privateAccount;
  //ArrayList<Card> postedCards;
  int numPosted;
  //ArrayList<Card> acceptedCards;
  int numAccepted;
  //ArrayList<Card> attendedCards;
  int numAttended;
  
  //constructor
  
  //builds a Person with any default information
  public Person() {
    name = null;
    surname = null;
    nickname = null;
    verified = false;
    privateAccount = false;
    //postedCards = null;
    numPosted = 0;
    //acceptedCards = null;
    numAccepted = 0;
    //attendedCards = null;
    numAttended = 0;
    
  }

  
  //builds a Person with a name and a surname
  public Person(String name, String surname) {
    this.name = name;
    this.surname = surname;
    nickname = null;
    verified = false;
    privateAccount = false;
    //postedCards = null;
    numPosted = 0;
    //acceptedCards = null;
    numAccepted = 0;
    //attendedCards = null;
    numAttended = 0;
    
  }
  
  //builds a Person with a name, a surname and a nickname
  public Person(String name, String surname, String nickname) {
    this.name = name;
    this.surname = surname;
    this.nickname = nickname;
    verified = false;
    privateAccount = false;
    //postedCards = null;
    numPosted = 0;
    //acceptedCards = null;
    numAccepted = 0;
    //attendedCards = null;
    numAttended = 0;
    
  }
  
  
//  Card class not written yet
  
//  public void get addPostedCards(Card x)
//  {
//    postedCards.add(x);
//    numPosted ++;
//  }
  
  
//  Card class not written yet
  
//  public void get addAcceptedCards(Card x)
//  {
//    acceptedCards.add(x);
//    numAccepted ++;
//  }

//  Card class not written yet  
  
//  public void get addAttendedCards(Card x)
//  {
//    attendedCards.add(x);
//    numAttended ++;
//  }
  
  public String getName()
  {
    return name;
  }
  
  public String getSurname()
  {
    return surname;
  }
  
  public String getNickname()
  {
    return nickname;
  }
  
  public boolean getVerified()
  {
    return verified;
  }
  
  public boolean getPrivate()
  {
    return privateAccount;
  }
  
//  public ArrayList<Card> getPostedCards()
//  {
//    return postedCards;
//  }
  
  public int getNumPosted()
  {
    return numPosted;
  }
  
//  public ArrayList<Card> getAcceptedCards()
//  {
//    return acceptedCards;
//  }
  
  public int getAcceptedPosted()
  {
    return numAccepted;
  }
  
//  public ArrayList<Card> getAttendedCards()
//  {
//    return attendedCards;
//  }  
  
  public int getNumAttended()
  {
    return numAttended;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setSurname(String surname)
  {
    this.surname = surname;
  }
  
  public void setNickname(String surname)
  {
    this.nickname = nickname;
  }
  
  public void setVerified(boolean verrified)
  {
    this.verified = verified;
  }
  
  public void setPrivate(boolean privateAccount)
  {
    this.privateAccount = privateAccount;
  }
  
//  public void setPostedCards(ArrayList<Card> postedCards)
//  {
//    this.postedCards = postedCards;
//  }
  
  public void setNumPosted(int numPosted)
  {
    this.numPosted = numPosted;
  }
  
//  public void setAcceptedCards(ArrayList<Card> acceptedCards)
//  {
//    this.acceptedCards = acceptedCards;
//  }
  
  public void setAcceptedPosted(int numAccepted)
  {
    this.numAccepted = numAccepted;
  }
  
//  public void setAttendedCards(ArrayList<Card> attendedCards)
//  {
//    this.attendedCards = attendedCards;
//  }  
  
  public void setNumAttended(int numAttended)
  {
    this.numAttended = numAttended;
  }
}
