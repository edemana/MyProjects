
/**
* Author: Edem K. Anagbah
* Date: 18-05-2024
* Purpose: This class, CustomArrayList, is a custom implementation of a dynamic array data structure,
* similar to the built-in ArrayList class in Java.
* It provides basic operations for managing a list of objects
*/
import java.util.*;

class CustomArrayList {
    // Keep track of the current size of the list
    private int size;
    // Default size the CustomArrayList
    private final int DefaultCapacity = 10;
    // Initialize an empty array to store elements
    Object[] object = {};

    /**
     * Constructor to initialize the list
     */
    public CustomArrayList() {
        // Set the initial array to the default array
        object = new Object[DefaultCapacity];
        // Initialize the size to 0
        size = 0;
    }

    /**
     * Constructor that takes the parameter, size
     *
     * @param size
     */
    public CustomArrayList(int size) {
        this.size = size;
        object = new Object[size];
    }

    /**
     * Add an element to the end of the list
     *
     * @param element the element to be added
     */
    public void add(Object element) {
        // Check if the array is full
        if (size == object.length) {
            // Resize the array if it's full
            resize();
            // Add the element to the end of the array
            object[size] = element;
        }
        // Add the element to the end of the array
        object[size] = element;
        // Increment the size
        size++;
    }

    /**
     * This method removes an element at the specified index
     *
     * @param index the index of the element to be removed
     * @return the removed element
     * @throws Exception if the index is out of bounds
     */
    public Object remove(int index) throws IndexOutOfBoundsException {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            // Throw an exception if the index is out of bounds
            throw new IndexOutOfBoundsException();
        }
        // Get the element at the specified index
        Object returnValue = object[index];
        // Shift all elements after the removed element to the left
        System.arraycopy(object, index + 1, object, index, size - index - 1);
        // Decrement the size
        size--;
        // Trim the array to the new size
        object = Arrays.copyOf(object, size);
        // Return the removed element
        return returnValue;
    }

    /**
     * Remove an element with a specific title (for Movie objects)
     * It is most useful to the MoviesList class
     *
     * @param element the title of the element to be removed
     * @throws Exception if the element is not found
     */
    public Object remove(Object element) throws IndexOutOfBoundsException {
        // Iterate over the array and check for a match
        for (int i = 0; i < size; i++) {
            Object item = object[i];
            if (item.toString().toUpperCase().contains(element.toString().toUpperCase())) {
                // Remove the element if a match is found
                remove(i);
            }
        } // Return null if the element is not found
        return element;
    }

    /**
     * Set an element at the specified index
     *
     * @param index   the index of the element to be set
     * @param element the new element
     * @throws Exception if the index is out of bounds
     */
    public void set(int index, Object element) throws IndexOutOfBoundsException {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            // Throw an exception if the index is out of bounds
            throw new IndexOutOfBoundsException();
        }
        // Set the element at the specified index
        object[index] = element;
    }

    /**
     * Get an element at the specified index
     *
     * @param index the index of the element to be retrieved
     * @return the element at the specified index
     * @throws Exception if the index is out of bounds
     */
    public Object get(int index) throws IndexOutOfBoundsException {
        // Check if the index is within bounds
        if (index <= size) {
            // Return the element at the specified index
            return object[index];
        }
        // Throw an exception if the index is out of bounds
        throw new IndexOutOfBoundsException();
    }

    /**
     * Check if the list is empty
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        // Return true if the size is 0, false otherwise
        return size == 0;
    }

    /**
     * Get the size of the list
     *
     * @return the size of the list
     */
    public int size() {
        // Return the current size of the list
        return size;
    }

    /**
     * Display all elements in the list
     */
    public String display() {
        // Iterate over the array and print each element
        String str = new String();
        for (Object item : object) {
            if (item != null) {
                str += item.toString() + ", ";
            }

        }
        // Remove trailing comma and space
        if (str.endsWith(", ")) {
            str = str.substring(0, str.length() - 2);
        }
        return "[" + str + "]";
    }

    /**
     * Getter method to return the size of the CustomArrayList
     *
     * @return size of the CustomArrayList
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter method to set the size of the CustomArrayList
     *
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Resize the array to double its current size
     */
    private void resize() {
        // Create a new array with double the size of the current array
        object = Arrays.copyOf(object, (object.length * 2));
    }

}
