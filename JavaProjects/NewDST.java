import java.util.*;

public class NewDST {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList mixedList = new ArrayList();
        mixedList.add("Java");
        mixedList.add(123);
        mixedList.add(45.67);
        mixedList.add(true);

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);

        numberList.add(20);

        numberList.add(30);

        numberList.add(40);

        numberList.add(50);
        Iterator<Object> iterator = mixedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Integer totaInteger= 0;
        for (Integer number : numberList) {
            System.out.println(number);
            // int total =+ (int) number ;

        }
        int total = 0;
        for (int j = 0; j <= numberList.size() - 1; j++) {
            total += numberList.get(j);
        }
        System.out.println(total);

    }
}