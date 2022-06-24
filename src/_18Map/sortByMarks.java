package _18Map;

import java.util.Comparator;
import java.util.Map;

public class sortByMarks implements Comparator <Map.Entry<String,Student>> {
	
	    @Override
	    public int compare(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2) {
	       return e1.getValue().getMarks()>e2.getValue().getMarks() ? +1:-1;
	    }
	
}
class MethodReferenceForComparator{

    public static int CompareStudentRoll(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2){
        return e1.getValue().getMarks()>e2.getValue().getMarks() ? 1:-1;
    }
}
