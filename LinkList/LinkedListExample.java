
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        // List<Integer> list2= Arrays.asList(1,2,3,4,5,6); 
        // List<Integer> list3 = new  ArrayList<>();
        // LinkedList<Integer> list4 = new LinkedList<>(Arrays.asList(10,20,30,40,60));
        
        

        List<String> list = new LinkedList<>();
        
        // Add elements
        list.add("Vikas");
        list.add("Bipin");
        list.add("Singh");


        list.get(2);  //0(n)

        // LinkedList.removeIf(x -> x%2 == 0);

        // Add at first and last
        list.addFirst("Archer"); //0(1)
        list.addLast("Infotech");

        System.out.println("LinkedList: " + list);

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove("Bipin");

        System.out.println("After removals: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Iterate
        System.out.println("Iterating through LinkedList:");
        for(String name : list) {
            System.out.print(name);
        }

    }
}
