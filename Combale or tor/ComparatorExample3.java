import java.util.*;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // sort by name
    }
}

public class ComparatorExample3  {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(3, "Vikas"),
                new Student(1, "Singh"),
                new Student(2, "Bipin")
        );

        list.sort(new NameComparator()); // use Comparator

        System.out.println(list);
    }
}
