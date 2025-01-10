package ArrayList;

import java.util.*;

public class All_Operation {

	public static void main(String[] args) {
		        // Create an ArrayList
		        ArrayList<Integer> mylist = new ArrayList<>();

		        // Add values
		        Scanner in = new Scanner(System.in);
		        System.out.println("Please enter the number of elements:");
		        int n = in.nextInt();
		        for (int i = 0; i < n; i++) {
		            int s = in.nextInt();
		            mylist.add(s);
		        }

		        // Add a value at a specific index
		        if (mylist.size() > 2) {
		            mylist.add(2, 8); // Add 8 at index 2
		        } else {
		            System.out.println("Not enough elements to add at index 2.");
		        }

		        // Change a value at a specific index
		        if (mylist.size() > 1) {
		            mylist.set(1, 10); // Replace the value at index 1 with 10
		        }

		        // Check if a value exists
		        System.out.println("Contains 2: " + mylist.contains(2));

		        // Get an element
		        if (mylist.size() > 4) {
		            System.out.println("Element at index 4: " + mylist.get(4));
		        }

		        // Get the index of a particular element
		        System.out.println("Index of 10: " + mylist.indexOf(10));

		        // Iterate using a for loop
		        System.out.println("Using for loop:");
		        for (int i = 0; i < mylist.size(); i++) {
		            System.out.print(mylist.get(i) + " ");
		        }

		        // Iterate using for-each loop
		        System.out.println("\nUsing for-each loop:");
		        for (int element : mylist) {
		            System.out.print(element + " ");
		        }

		        // Iterate using an iterator
		        System.out.println("\nUsing iterator:");
		        Iterator<Integer> myIte = mylist.iterator();
		        while (myIte.hasNext()) {
		            System.out.print(myIte.next() + " ");
		        }

		        // Remove an element
		        if (!mylist.isEmpty()) {
		            mylist.remove(0); // Remove element at index 0
		        }
		        System.out.println("\nAfter removing value at index 0: " + mylist);

		        // Close the Scanner
		        in.close();
		    
		

		
	}

}
