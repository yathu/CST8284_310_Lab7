import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

public class InterviewSlot implements Comparable<InterviewSlot> {

    Calendar cal = Calendar.getInstance();
    private java.time.ZonedDateTime startTime;
    private Duration duration;

    public InterviewSlot(java.time.ZonedDateTime startTime, Duration duration) {
        setDuration(duration);
        setStartTime(startTime);

    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setStartTime(java.time.ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public java.time.ZonedDateTime getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return "Interview Start " + getStartTime() + "Duration :  " + getDuration().toMinutes();
    }

    @Override

    public int compareTo(InterviewSlot s) {
        return this.getStartTime().compareTo(s.getStartTime());

    }

}