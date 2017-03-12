import java.util.ArrayList;

/**
 * A simple Java class!
 */
public class Students extends People
{
   // properties
   
   Srs srs;
   String department;
   String age; // optional?
   Schedule schedule; // ders programý
   ArrayList<Time> upcomingExams; // the days of upcoming exams.
   Time nextClass; // time until next class
   UniClass currentClass; // if any
   // constructors
   
   public Students( String id )
   {
      super( null, null );
      srs = new Srs(id); 
      super.nameChange( srs.name, srs.surname);
   }
   
   public Students( String id, String nickname)
   {
      super( null );
      srs = new Srs(id);
   }
   
   // methods

}