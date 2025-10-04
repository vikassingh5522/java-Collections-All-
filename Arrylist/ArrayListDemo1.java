import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Full List: " + list);
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("List Size: " + list.size());
        System.out.println("Removed element: " + list.remove(2));
        System.out.println("After remove: " + list);
        System.out.println("Replaced element: " + list.set(3, 60));  // replace 50 with 60
        System.out.println("After set: " + list);
        System.out.println("List contains 50: " + list.contains(50));  // check element present or not

        list.add(4, 70); // add element at specific index
        System.out.println("After adding element at index 4: " + list);

        //  System.out.println("remove the elemen in midle: "+ list.re(3,40));  not present   altenate    
        // ✅ Remove element in the middle (example: value 40)
        boolean removed = list.remove(Integer.valueOf(40));
        if (removed) {
            System.out.println("Removed element 40");
        } else {
            System.out.println("Element 40 not found");
        }
        System.out.println("After removing 40: " + list);

        // for loop to iterate the list
        System.out.print("List elements using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // for each loop to iterate the list
        System.out.print("List elements using for-each loop: ");
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
