// Comparator Demo
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparatorDemo {

    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(5, "john"));
        list.add(new Emp(1, "alexy"));
        list.add(new Emp(4, "devin"));
        list.add(new Emp(2, "oliver"));
        list.add(new Emp(3, "alexender"));

        list.stream().forEach(i -> System.out.println(i));
        System.out.println("============");
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        list.stream().forEach(i -> System.out.println(i));

    }
}

class Emp {
    private Integer id;
    private String name;

    Emp(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final Integer prime = 31;
        Integer result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emp other = (Emp) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + "]";
    }

}
