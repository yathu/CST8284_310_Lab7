import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

public class InterviewSlot implements Comparable<InterviewSlot> {

    Calendar cal = Calendar.getInstance();
    private Date startTime = cal.getTime();
    private Integer duration;

    public InterviewSlot(Date start, Integer d) {
        setDuration(d);
        setStartTime(start);

    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "Interview Start " + getStartTime() + "Duration :  " + getDuration();
    }

    @Override

    public int compareTo(InterviewSlot s) {
        return this.getStartTime().compareTo(s.getStartTime());

    }

}