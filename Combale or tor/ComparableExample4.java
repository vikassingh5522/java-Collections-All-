import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // sort by id (ascending)
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableExample4 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(3, "Vikas"),
                new Student(1, "Singh"),
                new Student(2, "Bipin")
        );

        Collections.sort(list); // uses compareTo()

        System.out.println(list);
    }
}
