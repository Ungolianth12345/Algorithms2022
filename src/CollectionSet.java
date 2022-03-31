import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        // HashSet. This appears to be unordered.
        HashSet<String> color = new HashSet<String>();
        color.add("red");
        color.add("blue");
        color.add("yellow");

        Iterator<String> values = color.iterator();
        System.out.println("The colors are: ");
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // TreeSet. This appears to order the elements first.
        TreeSet<String> apostles = new TreeSet<String>();
        apostles.add("Simon-Peter");
        apostles.add("Bart");
        apostles.add("John");
        apostles.add("Jude");
        apostles.add("Bart");

        Iterator<String> a = apostles.iterator();
        System.out.println("Some apostles of Jesus were: ");
        while (a.hasNext()) {
            System.out.println(a.next());
        }
    }
}
