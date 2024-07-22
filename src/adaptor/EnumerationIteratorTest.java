package adaptor;

import java.util.*;

public class EnumerationIteratorTest {
    public static void main (String args[]) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(Collections.enumeration(list));

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
