public class MAL {
    public static void main(String[] args) throws Exception {
        CustomArrayList list = new CustomArrayList();

        // Test add method
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("Size of the list: " + list.size());
        // Test display method
        list.display();

        // Test get method
        System.out.println("Element at index 1: " + list.get(1));

        // Test set method
        list.set(1, "Programming");
        list.display();

        // Test remove method
        list.remove("Hello");
        list.display();

        // Test size and isEmpty methods
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
