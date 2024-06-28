import java.util.*;

public class Hub {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E item : list)
            if (!newList.contains(item))
                newList.add(item);

        return newList;

    }

    @SuppressWarnings("unchecked")
    public static <E> E max(E[] list) {
        E max = list[0];
        for (E item : list) {
            if (((Comparable<E>) item).compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        System.out.println("Original list: " + list);
        ArrayList<Integer> removed = removeDuplicates(list);
        System.out.println("No dups: " + removed);
        Integer max = max(list.toArray(list.toArray(new Integer[0])));
        System.out.println("Max: " + max);

    }

}
