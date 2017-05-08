import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Enes Yıldırım on 30.04.2017.
 */
public class Moment extends Time {

	private String rawTime;
	private String formTime;

	public Moment(int h, int m){
		SimpleDateFormat sdf = new SimpleDateFormat("HH/mm/ss/dd/MM/yyyy");
		if ( h < 0 || h > 24 || m < 0 || m > 59){
			rawTime = "invalid";
			formTime = "incalid";
			System.out.println("INVALID TIME");
		}
		else{
			Calendar cal = Calendar.getInstance();
		}

	}
}

