//import java.util.ArrayList;

class Gen1<T, E> {
    T ob;
    E oj;

    Gen1(T o) {
        ob = o;

    }

    Gen1(T o, E j) {
        ob = o;
        oj = j;

    }

    T getob() {
        return ob;

    }

    E getoj() {
        return oj;

    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }

    void showType1() {
        System.out.println("Type of E is " + oj.getClass().getName());
    }
}

class GenDemo1 {
    public static void main(String[] args) {
        Gen1<Integer, String> iOb = new Gen1<>(88, "Name");
        iOb.showType();

        int v = iOb.getob();
        System.out.println(" value: " + v);

        System.out.println();
        iOb.showType1();
        String b = iOb.getoj();
        System.out.println(" value: " + b);

        // Gen<Integer, String> strob = new Gen<Integer, String>(2, "Generics");
        // strob.showType1();
        // String str = strob.getoj();
        // System.out.println("value: " + str);
    }

}