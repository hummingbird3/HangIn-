import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
 * Created by Enes Yildirim on 30.04.2017.
 */
public class Now extends Moment{

	public Now(){
		super();
	}


	public String createID(String s){
		String str = s + dateFormat3.format(calendar.getTime());
		return str;
	}

}
