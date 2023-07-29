
import java.util.Comparator;
import models.CoachModel;

public class CoachNameComparator implements Comparator<CoachModel>{

    @Override
    public int compare(CoachModel t, CoachModel t1) {
        return t.getCoachName().compareTo(t1.getCoachName());
    }
    
}
