
import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Adding elements in a ArrayList (or List)
        list1.add("Hey");
        list1.add("How are you");
        list1.add("Hello World!");
        System.out.println(list1);

        // Adding at a particular index position
        list1.add(3, "Adding in between");
        System.out.println(list1);

        // 'Get' a value from a list
        System.out.println(list1.get(2));

        // 'Set' value from the list
        System.out.println(list1.set(1, "Haha")); // this is like the pop feature where it shows you the value before removing
        System.out.println(list1);

        // 'Remove' a value from the list
        System.out.println(list1.remove(2)); // this is like the pop feature where it shows you the value before removing
        System.out.println(list1);
        /* Removing of an element in turn shift the remaning elemnt to fill in the void, so if there is a question or a choice to remove
        an element from 'x' position always go ahead with removing the last element as shifting can be avoided + it is least expensive (both time and space complexity) */

        // Size of list
        System.out.println(list1.size());

        // indexOf in array list
        System.out.println(list1.indexOf("Hey1"));

        // toString() returns a string representation of the list
        list2.add(12);
        list2.add(1);
        list2.add(0);

        System.out.println(list2);
        System.out.println(list2.toString()); // no much of difference, but is used in other sense

        // Clear the list
        list1.clear();
        System.out.println(list1);
    }
}
