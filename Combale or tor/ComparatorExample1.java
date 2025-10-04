import java.util.*;

class DesOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer s1, Integer s2) {
        // return s2 - s1; // Sort in descending order
        return s1 -s2;  // sort in asc order 
    }
}

public class ComparatorExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Use custom comparator
        list.sort(new DesOrder());

        System.out.println(list); // Output: [6, 5, 4, 3, 2, 1]
        //  System.out.println(list);  //[1, 2, 3, 4, 5, 6]

    
    }
}
