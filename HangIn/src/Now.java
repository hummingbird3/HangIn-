import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
 * Created by USER1 on 30.04.2017.
 */
public class Now extends Moment{

	public Now(){
		super(32980,43908); // NOT WORKING TEMP
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

	}
}
