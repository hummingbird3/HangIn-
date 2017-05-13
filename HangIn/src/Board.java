import java.util.ArrayList;


/**
 * Created by Enes Yıldırım on 30.04.2017.
 */
public class Board {

    private String name;
    CardHolder ch;

    public Board(){
        ch = new CardHolder();
    }

    public String toString(){
        return ch.toString();
    }

    public String toStringNum(){
        return ch.toStringNum();
    }

    public CardHolder getCards(){
        return ch;
    }


}
