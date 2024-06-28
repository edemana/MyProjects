//import java.util.ArrayList;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;

    }

    T getob() {
        return ob;

    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println(" value: " + v);
        System.out.println();
        Gen<String> strob = new Gen<>("Generics");
        strob.showType();
        String str = strob.getob();
        System.out.println("value: " + str);
    }

}
