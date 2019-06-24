
import java.util.Comparator;

public class t_5_StudentComparetor implements Comparator<t_5_Student> {


	    @Override
	    public int compare(t_5_Student s1, t_5_Student s2) {
	        return s1.getStuId().compareTo(s2.getStuId());
	    }
	}