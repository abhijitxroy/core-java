import java.util.List;
import java.util.function.Supplier;

public class SupplierFI implements Supplier<String> {

    @Override
    public String get() {
        return "Abhijit";
    }
    
    public static void main(String[] args) {

        // Way-1
        Supplier<String> supplier1 = new SupplierFI();
        System.out.println(supplier1.get());

        // Way-2
        Supplier<String> supplier2 = () -> {
            return "Abhijit";
        };

        System.out.println(supplier2.get());

        List<String> list = List.of("John", "Dcosta");
        System.out.println(list.stream().findAny().orElseGet(supplier1));


    }
}
