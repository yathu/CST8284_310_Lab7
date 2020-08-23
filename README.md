#CST8284 - Object-Oriented Programming (Java)

Lab07- Using Generics

#III. Your work
1. Write the InterviewSlot class
2. Complete the DataCreator class
public static void createData(ArrayList<InterviewSlot> slots, int num);
Creates a num InterviewSlot objects and stores them in the slots container.
Use the Math.random() method to create variation in the objects created:
● Make the range of variation of the dates in hours.
● The range should be 30 days, meaning that the dates could vary between
say, today and 30 days from now. The max of the range would be equal
to 30*24.
● You can set the minimum of the range to 1.
● Make the duration vary between 1 and 60.
Examples of objects:
Thu Apr 02 05:28:59 EDT 2020 duration:18
Fri Mar 27 00:22:32 EDT 2020 duration:48
Wed Apr 01 20:22:32 EDT 2020 duration:8
Sat Mar 28 19:22:32 EDT 2020 duration:31
To manipulate a Calendar date, you can review the method:
void add(Calendar.HOUR_OF_DAY, int amount);

Refer to this resource:
https://docs.oracle.com/javase/6/docs/api/java/util/Calendar.html
3. Test the method with code such as this in the main:
ArrayList<InterviewSlot> slots = new ArrayList<>();
createData(slots, 10);
for ( InterviewSlot x: slots) {
System.out.println(x);
}

4. Complete the code for
public static <E extends Comparable<E>> void outputData(List<E> l);
Prints out the items stored in the list l
And use it to test the createData() method.

5. Complete the code for createIntegers() to create a num Integer objects between 201 and
545.
In the main(), add this code to test
ArrayList<Integer> a = new ArrayList<>();
DataCreator.createIntegers(a, 10);
System.out.println("Before sorting");
DataCreator.outputData(a);
Collections.sort(a);
System.out.println("After sorting");
DataCreator.outputData(a);

6. Modify the InterviewSlot class to look like this:

The InterviewSlot is implementing the Comparable interface.
Complete the InterviewSlot.
The comparison will be based on the startTime.
Date has methods such as before(), after() to compare the Date objects.
7. Complete the code in the DataCreator();
8. Add the required code in main() so we can create 25 randomized InterviewSlot objects, print
them, sort the array and print them again using the methods in DataCreator.
