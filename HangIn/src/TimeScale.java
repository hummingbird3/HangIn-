/**
 * Created by USER1 on 30.04.2017.
 */
public class TimeScale {
	Moment start;
	Moment end;

	public TimeScale(Moment a, Moment b){
		start = a;
		end = b;
	}

	public TimeScale(Moment b){
		start = new Now();
		end = b;
	}

	public String toString(){
		return start.toString() + "-" + end.toString();
	}

	public String toStringReadable(){
		return start.toStringReadable() + " to " + end.toStringReadable();
	}
}
