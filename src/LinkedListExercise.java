import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");

        colors.addFirst("blue");

        System.out.println("Test Case 1\nExpected:\t[blue, red, orange, yellow, green]\nActual:\t\t" + colors);

        colors.addLast("indigo");

        System.out.println("\nTest Case 2\nExpected:\t[blue, red, orange, yellow, green, indigo]\nActual:\t\t" + colors);

        colors.removeFirst();

        System.out.println("\nTest Case 3\nExpected:\t[red, orange, yellow, green, indigo]\nActual:\t\t" + colors);

        colors.removeLast();

        System.out.println("\nTest Case 4\nExpected:\t[red, orange, yellow, green]\nActual:\t\t" + colors);
        System.out.println("\nTest Case 5\nExpected:\tred\nActual:\t\t" + colors.getFirst());
        System.out.println("\nTest Case 6\nExpected:\tgreen\nActual:\t\t" + colors.getLast());

        LinkedList<String> names = new LinkedList<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        System.out.println("\n" + names);

        ListIterator<String> iter = names.listIterator(); // |KJMF
        iter.next(); // K|JMF
        iter.next(); // KJ|MF
        iter.next(); // KJM|F
        iter.add("Ray");

        System.out.println(names);

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String removeName = iterator.next();
            if (removeName.equals("Jay")) {
                iterator.remove();
            }
        }

        System.out.println(names);

        ListIterator<String> beginning = names.listIterator();
        String beginList = "";
        while (beginning.hasNext()) {
            beginList += beginning.next() + "\n";
        }
        System.out.println("List of names from the beginning:\n" + beginList);

        LinkedList reverseNames = (LinkedList) names.clone();
        Collections.reverse(reverseNames);
        ListIterator ending = reverseNames.listIterator();
        String endList = "";
        while (ending.hasNext()) {
            endList += ending.next() + "\n";
        }

        System.out.println("List of names from the end:\n" + endList);


    }
}
