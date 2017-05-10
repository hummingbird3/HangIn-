import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Enes Yıldırım on 30.04.2017.
 */
public class Moment extends Time {

	private String rawTime;
	private String formTime;
	Calendar calendar;

	public Moment(int h, int m){
		super();

		if ( h < 0 || h > 24 || m < 0 || m > 59){
			rawTime = "invalid";
			formTime = "invalid";
			System.out.println("INVALID TIME");
		}
		else {
			calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR, h);
			calendar.set(Calendar.MINUTE, m);
		}

	}

	public Moment(int h, int m, int d, int mo){
		super();

		if ( h < 0 || h > 24 || m < 0 || m > 59 || mo < 0 || mo > 12 || d < 0 || d > 31){
			rawTime = "invalid";
			formTime = "incalid";
			System.out.println("INVALID TIME");
		}

		else {
			calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR, h);
			calendar.set(Calendar.MINUTE, m);
			calendar.set(Calendar.DATE, d);
			calendar.set(Calendar.MONTH, mo-1);
		}

	}

	public Moment(){
		super();

		calendar = Calendar.getInstance();
	}

	public String toString(){
		return dateFormat.format(calendar.getTime());
	}

	public String toStringReadable(){
		return dateFormat2.format(calendar.getTime());
	}


}

