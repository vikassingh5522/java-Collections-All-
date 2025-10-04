import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringComp implements Comparator<String> {
    @Override
    public int compare(String s1 , String s2)
    {
        return s1.compareTo(s2);
        // return s2.compareTo(s1);
    }

}


public class ComparatorExample2 {
    public static void main(String[] args) {

        List<String> List =  Arrays.asList("vikas ", "singh", "bipin", "vandana");

        List.sort(new StringComp());
        
        System.out.println(List);
        
    }
}


// or


// import java.util.Arrays;
// import java.util.List;

// public class ComparatorExample2 {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("vikas", "singh", "bipin", "vandana");

//         // Descending order
//         list.sort((s1, s2) -> s2.compareTo(s1));

//         System.out.println(list);
//     }
// }

