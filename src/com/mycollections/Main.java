/**
 *  Java program to create, update, display, and clear LinkedList instance.
 */

package com.mycollections;

import java.util.LinkedList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of LinkedList.
        List<Short> myList = new LinkedList<>();

        // Add values.
        myList.add((short) -32768);
        myList.add((short) -32100);
        myList.add((short) 0);
        myList.add((short) 200);
        myList.add((short) 32767);

        // Print all values of myList.
        System.out.println(myList); // Output: [-32768, -32100, 0, 200, 32767]

        // Update.
        myList.add((short) 1);

        // Print all values of myList.
        System.out.println(myList); // Output: [-32768, -32100, 0, 200, 32767, 1]

        // Print the first value of myList.
        System.out.println("First value: " + myList.getFirst()); // Output: First value: -32768

        // Print the last value of myList.
        System.out.println("Last value: " + myList.getLast()); // Output: Last value: 1

        // Clear.
        myList.clear();

    }
}