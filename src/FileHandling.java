import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00201634\\Desktop\\hamlet.txt";
        TreeSet<String> hamlet = new TreeSet<String>();
        HashSet<String> hashHamlet = new HashSet<String>();
        HashMap<String, TreeSet<Integer>> mapHamlet = new HashMap<>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                TreeSet<Integer> line = new TreeSet<>();
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    line.add(lineNumber);
                    String word = lineParser.next();
                    //hamlet.add(word);
                    //hashHamlet.add(word);
                    //System.out.println(word + ", " + line);
                    mapHamlet.put(word, line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*Iterator<String> listHamlet = hamlet.iterator();
        System.out.println("Hamlet soliloquy in order: ");
        while (listHamlet.hasNext()) {
            System.out.println(listHamlet.next());
        }

        System.out.println("TreeSet size: " + hamlet.size());

        Iterator<String> listHamletHash = hashHamlet.iterator();
        System.out.println("Hamlet soliloquy in order: ");
        while (listHamletHash.hasNext()) {
            System.out.println(listHamletHash.next());
        }
        System.out.println("HashSet size: " + hashHamlet.size());

        System.out.println(hashHamlet.contains("to"));*/

        for (Map.Entry<String, TreeSet<Integer>> pair : mapHamlet.entrySet()) {
            System.out.println("Word: " + pair.getKey() + ", Line: " + pair.getValue());
        }
    }
}
