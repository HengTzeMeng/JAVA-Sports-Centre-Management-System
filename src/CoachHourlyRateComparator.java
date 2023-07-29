
import java.util.Comparator;
import models.CoachModel;

public class CoachHourlyRateComparator implements Comparator<CoachModel>{

    @Override
    public int compare(CoachModel t, CoachModel t1) {
        return t.getHourlyRate() - t1.getHourlyRate();
    }
    
}
