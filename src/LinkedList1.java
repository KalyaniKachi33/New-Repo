import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("I");
        list.add("can");
        list.add("do");
        list.add("it");
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(" String List= " + list);
        list.add("I");
        list.add("Keep");
        list.add("Learning");
        System.out.println(" String List= " + list);
        list.remove(4);
        System.out.println("Linked String List= " + list);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        System.out.println("Array String List= " + list2);
    }
}
