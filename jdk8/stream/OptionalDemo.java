import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

public class OptionalDemo {
     public static void main(String[] args) {
        Customer johnCustomer = new Customer(101, "john", "john@email.com", Arrays.asList("12345", "67890"));
        Customer smithCustomer = new Customer(101, "smith", null, Arrays.asList("23456", "78901"));

        /** Optional Object Creation - 3 Ways
         1. empty
         2. of
         3. ofNullable
        */
        // 1. empty
        Optional<Customer> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // 2. of => throw null if exist null
        Optional<String> smithOfOptional = Optional.of(smithCustomer.getEmail());
        System.out.println(smithOfOptional);

        // 3. ofNullable => 
        Optional<String> smithOfNullableOptional = Optional.ofNullable(smithCustomer.getEmail());
        System.out.println(smithOfNullableOptional);

        // Optional popular Methods
        // Optional :: isPresent => get() || orElse throw exception || orElse provide a default value
        Optional<String> smithOfNullableOptional2 = Optional.ofNullable(smithCustomer.getEmail());
        if(smithOfNullableOptional2.isPresent()){
            System.out.println(smithOfNullableOptional2.get());
        }
        // else {
        //     System.out.println(smithOfNullableOptional2.orElseThrow(() -> new IllegalArgumentException("Null received!")));
        // }
          
        // OR 
        else{
            System.out.println(smithOfNullableOptional2.orElse("null@email.com"));
        }
        
     }
}

class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phone;

    public Customer(int id, String name, String email, List<String> phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getPhone() {
        return phone;
    }
    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }        
}
