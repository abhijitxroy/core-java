import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {
    
    public static void main(String[] args) {
        
        // List sort - using collections
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(56);
        list.add(78);
        list.add(12);
        list.add(22);

        
        // Way-1 - Collections.sort method
        System.out.println("Way-1: ");
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

        list.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Way-2 - stream sorted() method
        System.out.println("Way-2: ");
        list.stream().sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Way-3 - Comparator compareTo lamdba function
        System.out.println("Way-3: ");
        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(e -> System.out.print(e + " "));
        System.out.println();


        // Way-4 - Comparator.reverseOrder()
        System.out.println("Way-4: ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Way-5 - Comparator.comparing
        System.out.println("Way-5: ");
        list.stream().sorted(Comparator.comparing(Integer::new)).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
