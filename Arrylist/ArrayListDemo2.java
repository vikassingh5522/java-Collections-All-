import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListDemo2 {
    public static void main(String[] args) throws Exception {

        // 1. Normal ArrayList (fully mutable: add, remove, set all work)
        List<String> list = new ArrayList<>();
        list.add("vikas");
        list.add("bipin");
        list.add("rock");
        System.out.println("list (ArrayList): " + list);
        System.out.println("Class: " + list.getClass().getName());

        System.out.println("================");

        // 2. Arrays.asList() → fixed-size list backed by array
        // You CANNOT add/remove elements here, but you CAN replace using set()
        List<String> list2 = Arrays.asList("vikas", "vishal", "bipin", "vandana");
        System.out.println("list2 (Arrays.asList): " + list2);
        System.out.println("Class: " + list2.getClass().getName());

        // list2.add("rock"); ❌ UnsupportedOperationException
        list2.set(1, "kumar"); // ✅ only replacement is allowed
        System.out.println("After set, list2[1] = " + list2.get(1));
        System.out.println("Size of list2: " + list2.size());
        System.out.println("list2: " + list2);

        System.out.println("====================");

        // 3. Arrays.asList() from existing array
        // This list is still fixed-size, but changes to the array reflect in the list
        String[] arr = { "apple", "orange", "banana", "watermelon" };
        List<String> list3 = Arrays.asList(arr);
        System.out.println("list3 (from array): " + list3);
        System.out.println("Class: " + list3.getClass().getName());

        // If we change the array, list3 also changes
        arr[1] = "mango";
        System.out.println("After modifying array, list3: " + list3);

        System.out.println("========================");

        // 4. List.of() → Immutable List (cannot add, remove, or set)
        List<String> list4 = List.of("apple", "orange", "banana", "watermelon");
        System.out.println("list4 (List.of): " + list4);
        System.out.println("Class: " + list4.getClass().getName());

        // list4.set(1, "mango"); ❌ UnsupportedOperationException
        // list4.add("grapes"); ❌ UnsupportedOperationException

        System.out.println("======================");

        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
        // Replace element at index 2 in list5
        list5.set(2, 7); // ✅ Correct: using list5
        System.out.println("list5 after set: " + list5);

        System.out.println("=============UnsupportedOperationException==========");

        List<Integer> list6 = List.of(1, 2, 3, 4);
        list6.set(1, 33);
        System.out.println(list6);

    }
}
