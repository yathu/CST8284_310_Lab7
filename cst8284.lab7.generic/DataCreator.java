import java.awt.List;
import java.util.ArrayList;

public class DataCreator {

    public static void main(String[] args) {
        ArrayList<InterviewSlot> slots = new ArrayList<>();
        createData(slots, 10);
        for ( InterviewSlot x: slots) {
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

    }

}