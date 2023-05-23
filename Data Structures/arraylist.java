import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        /*
         * 1.Add
         * 2.Get
         * 3.Modify
         * 4.Delete
         * 5.Iterate
         */

        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add in between
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        System.out.println("------------------------");

        // Iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
