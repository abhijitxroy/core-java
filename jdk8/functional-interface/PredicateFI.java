import java.util.List;
import java.util.function.Predicate;

public class PredicateFI implements Predicate<Integer>{
   
    @Override
    public boolean test(Integer i) {
        if(i % 2 == 0 ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Way-1
        Predicate<Integer> predicate1 = new PredicateFI();
        System.out.println("Predicate1 Result: "+predicate1.test(10));

        // Way-2
        Predicate<Integer> predicate2 = (t) -> t % 2 == 0;
        System.out.println("Predicate2 Result: "+predicate2.test(100));

        // Example-1
        List<Integer> list = List.of(22,3,4,56,1,10,34);
        // list.stream().forEach(consumer1); 
        // OR
        list.stream().filter(predicate2).forEach(e -> System.out.println("Even No: " + e));
    }
}
