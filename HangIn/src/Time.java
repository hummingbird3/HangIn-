import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Enes Yıldırım on 30.04.2017.
 */
public class Time {

	SimpleDateFormat dateFormat;
	SimpleDateFormat dateFormat2;

	public Time(){
		dateFormat = new SimpleDateFormat("HH/mm/ss/dd/MM/yyyy");
		dateFormat2 = new SimpleDateFormat("dd MMM YYYY HH:mm");
	}


}
