import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class DataCreator {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        DataCreator.createIntegers(a, 10);
        System.out.println("Before sorting");
        DataCreator.outputData(a);
        Collections.sort(a);
        System.out.println("After sorting");
        DataCreator.outputData(a);


        ArrayList<InterviewSlot> slots = new ArrayList<>();
        createData(slots, 10);
        for (InterviewSlot x : slots) {
        System.out.println(x);
        }

    }

    public static <E extends Comparable<E>> void outputData(ArrayList<E> l) {
        for (E L : l) {
            System.out.println(L);
        }

    }

    public static void createIntegers(ArrayList<Integer> a, int num) {

        for (int i = 0; i < num; i++) {
            Integer random = (int) (Math.random() * ((545 - 201) + 1)) + 1;
            a.add(random);

        }
    }

    public static void createData(ArrayList<InterviewSlot> slots, int num) {

        for (int i = 0; i < num; i++) {
            InterviewSlot interviewSlot = calculateInterviewSlot();
            slots.add(interviewSlot);
            // System.out.println(interviewSlot);
        }

    }

    public static InterviewSlot calculateInterviewSlot() {

        ZoneId z = ZoneId.of("America/Montreal");
        LocalDate today = LocalDate.now(z);

        // Add random number of days within next 30 days.
        int days = ThreadLocalRandom.current().nextInt(1, 31);
        LocalDate localDate = today.plusDays(days);

        // Days vary in length, such as 23, 24, 25, or other number of hours. So for
        // your date in your zone, calculate maximum number of seconds.
        java.time.ZonedDateTime start = localDate.atStartOfDay(z);
        java.time.ZonedDateTime stop = localDate.plusDays(1).atStartOfDay(z);
        Duration d = Duration.between(start.toInstant(), stop.toInstant());
        int seconds = (int) d.toSeconds(); // In Java 9 and later. For Java 8, call `Duration::getSeconds`.

        // That count of seconds becomes the maximum for our length of day. From this we
        // pick a random number of seconds.
        long secondsIntoDay = ThreadLocalRandom.current().nextInt(0, seconds);
        java.time.ZonedDateTime zdt = start.plusSeconds(secondsIntoDay);

        // Determine a random duration from 1 to 60 minutes for the elapsed time of each
        // event.

        int minutes = ThreadLocalRandom.current().nextInt(1, 61); // At least one minute, and less than 61 minutes.
        Duration duration = Duration.ofMinutes(minutes);

        return new InterviewSlot(zdt, duration);
    }

}