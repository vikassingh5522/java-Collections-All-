package VectorDemo;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> v = new Vector<>();

        System.out.println("----- Basic add / size / isEmpty -----");
        v.add("one");                // Collection.add(E)
        v.add("two");
        v.add("three");
        v.add(1, "one-and-half");    // List.add(index, E)
        v.addAll(Arrays.asList("four","five")); // addAll(Collection)
        System.out.println("Vector contents: " + v);
        System.out.println("size: " + v.size() + ", isEmpty: " + v.isEmpty());
        System.out.println("capacity: " + v.capacity()); // Vector specific

        System.out.println("\n----- Accessors: get / first / last / elementAt -----");
        System.out.println("get(2): " + v.get(2));               // List.get
        System.out.println("firstElement(): " + v.firstElement()); // Vector.elementAt(0)
        System.out.println("lastElement(): " + v.lastElement());
        System.out.println("elementAt(1): " + v.elementAt(1));   // Vector specific

        System.out.println("\n----- Search: contains / indexOf / lastIndexOf -----");
        System.out.println("contains(\"three\"): " + v.contains("three"));
        System.out.println("indexOf(\"one\"): " + v.indexOf("one"));
        System.out.println("lastIndexOf(\"one\"): " + v.lastIndexOf("one"));

        System.out.println("\n----- Replace / set -----");
        v.set(2, "THREE");           // List.set(index, E)
        System.out.println("After set(2, \"THREE\"): " + v);

        System.out.println("\n----- Remove operations -----");
        v.remove("one-and-half");    // remove(Object)
        System.out.println("After remove(\"one-and-half\"): " + v);
        String removed = v.remove(0); // remove(index) returns removed element
        System.out.println("Removed index 0 element: " + removed + ", now: " + v);
        v.removeIf(s -> s.startsWith("f")); // Collection.removeIf (Java 8+)
        System.out.println("After removeIf startsWith 'f': " + v);

        System.out.println("\n----- bulk operations: retainAll / removeAll / containsAll -----");
        Vector<String> other = new Vector<>(Arrays.asList("THREE", "five", "x"));
        System.out.println("other: " + other);
        System.out.println("v.containsAll(other): " + v.containsAll(other));
        // demonstrate retainAll (keep only elements present in given collection)
        Vector<String> vCopy = new Vector<>(v);
        vCopy.retainAll(Arrays.asList("THREE", "five"));
        System.out.println("vCopy after retainAll([THREE, five]): " + vCopy);

        System.out.println("\n----- Iteration: Iterator, ListIterator, Enumeration -----");
        System.out.print("Iterator: ");
        Iterator<String> it = v.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        System.out.print("ListIterator forward/backward: ");
        ListIterator<String> lit = v.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.print("| back: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        System.out.print("Enumeration (Vector specific): ");
        Enumeration<String> en = v.elements();
        while (en.hasMoreElements()) System.out.print(en.nextElement() + " ");
        System.out.println();

        System.out.println("\n----- Array conversions, copyInto, toArray -----");
        Object[] arr = v.toArray();
        System.out.println("toArray() -> " + Arrays.toString(arr));
        String[] strArr = new String[v.size()];
        v.copyInto(strArr); // copyInto requires array sized >= size
        System.out.println("copyInto(strArr) -> " + Arrays.toString(strArr));

        System.out.println("\n----- clone, clear, addElement, insertElementAt, removeElementAt -----");
        @SuppressWarnings("unchecked")
        Vector<String> cloned = (Vector<String>) v.clone(); // returns Object
        System.out.println("cloned: " + cloned);
        v.addElement("z");                 // Vector.addElement(E)
        v.insertElementAt("inserted", 1);  // Vector.insertElementAt(E, index)
        System.out.println("after addElement/insertElementAt: " + v);
        v.removeElementAt(1);              // Vector.removeElementAt(index)
        System.out.println("after removeElementAt(1): " + v);
        v.clear();
        System.out.println("after clear(): size = " + v.size() + ", contents: " + v);

        System.out.println("\n----- capacity & size control -----");
        Vector<Integer> vi = new Vector<>(5); // initial capacity
        vi.ensureCapacity(20);   // ensureCapacity (Vector specific)
        vi.setSize(10);          // setSize increases size (fills with nulls)
        System.out.println("vi size after setSize(10): " + vi.size() + ", capacity: " + vi.capacity());
        vi.trimToSize();
        System.out.println("vi capacity after trimToSize(): " + vi.capacity());

        System.out.println("\n----- convert List <-> subList -----");
        Vector<String> listForSub = new Vector<>(Arrays.asList("a","b","c","d","e"));
        List<String> sub = listForSub.subList(1, 4); // List.subList(from, to) -> [b,c,d]
        System.out.println("listForSub: " + listForSub + ", subList(1,4): " + sub);

        System.out.println("\n----- equals / hashCode -----");
        Vector<String> a = new Vector<>(Arrays.asList("x","y"));
        Vector<String> bvec = new Vector<>(Arrays.asList("x","y"));
        System.out.println("a.equals(bvec): " + a.equals(bvec) + ", a.hashCode(): " + a.hashCode());

        System.out.println("\n----- stream / forEach (Collection default methods) -----");
        Vector<Integer> nums = new Vector<>(Arrays.asList(1,2,3,4,5));
        nums.forEach(n -> System.out.print(n + " "));
        System.out.println();
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum via stream: " + sum);

        System.out.println("\n----- Summary of methods demonstrated -----");
        System.out.println("add, add(index, e), addAll, addElement, insertElementAt, get, set, remove(obj), remove(index),");
        System.out.println("removeElementAt, removeElement, removeIf, clear, clone, copyInto, toArray, contains, containsAll,");
        System.out.println("indexOf, lastIndexOf, firstElement, lastElement, elementAt, size, isEmpty, capacity, ensureCapacity,");
        System.out.println("trimToSize, setSize, iterator, listIterator, elements (Enumeration), retainAll, removeAll, equals, hashCode,");
        System.out.println("subList, forEach, stream.");
    }
}
