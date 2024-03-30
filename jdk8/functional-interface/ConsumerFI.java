// Conumer is a predefined Functional Interface by JDK

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {
    
    public static void main(String[] args) {
        
        // Way-1
        Consumer consumer1 = new Consumer(){
            public void accept(Object obj){

                System.out.println("Accept: "+ obj);
            }
        };
        consumer1.accept(10); // "Accept: 10"

        ////////////////////////////////////////////////

        // Way-2
        Consumer consumer2 = (t) -> System.out.println("Accept: "+ t);
        consumer2.accept(100); // "Accept: 100"


        // Example-1
        List<Integer> list = List.of(22,3,4,56,1,10,34);
        // list.stream().forEach(consumer1); 
        // OR
        list.stream().forEach((t) -> System.out.print(t + " "));

         
    }

}
