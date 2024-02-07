package coding.exercises.java.list;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // different ways of constructing an ArrayList
        ArrayList<String> list1 = new ArrayList<>();                    // creates an empty ArrayList with initial capacity of 10.

        ArrayList<String> list2 = new ArrayList<>(20);      // creates an empty ArrayList with supplied initial capacity.

        ArrayList<String> list3 = new ArrayList<>(list1);              // creates an ArrayList containing the elements of the supplied collection.

        // increase the current capacity of an ArrayList
        list1.ensureCapacity(20);  // Now 'list' can hold 20 elements.

        // decrease the current capacity of an ArrayList to the current size
        ArrayList<String> list = new ArrayList<>(); // Now 'list' can hold 10 elements (Default Initial Capacity)

        list.ensureCapacity(20);  // Now 'list' can hold 20 elements.

        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("ONE");

        //reducing the current capacity to current size of an ArrayList.
        list.trimToSize();

        // find the number of elements present in an ArrayList
        System.out.println("Size Of ArrayList = "+list.size());

        //  find out whether the given ArrayList is empty or not
        System.out.println(list.isEmpty());

        // check whether the given element is present in an ArrayList or not
        System.out.println(list.contains("ONE"));

        // get the position of a particular element in an ArrayList
        //Getting the index of first occurrence of "JAVA"
        System.out.println(list.indexOf("ONE"));     // Output : 0

        //Getting the index of last occurrence of "JAVA"
        System.out.println(list.lastIndexOf("ONE"));

    }
}
