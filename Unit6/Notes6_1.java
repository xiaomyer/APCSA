import java.util.*;

public class Notes6_1
// Intro to Array Lists
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		/*
		 * ArrayLists work a lot like arrays, but they grow/shrink
		 * as you add/remove values. They also use "get" and "set"
		 * commands instead of using square brackets []
		 */

		// Create a new ArrayList
		// In general:
		// ArrayList<datatype> listName = new ArrayList<datatype>();

		// Here is an ArrayList filled with Strings:
		ArrayList<String> names = new ArrayList<String>();

		// Fill an ArrayList using the ADD command
		// each of these adds a new element to the end of the list
		names.add("Squidward");
		names.add("Mr. Krabs");
		names.add("Patrick");

		// Specify an index to insert into a specific position in the list
		// this inserts Gary at index 1, everything else shifts over
		names.add(1, "Gary");

		// Modify an ArrayList using the SET command
		System.out.println(names.set(2, "Spongebob"));
		// The set command replaces whatever value was in that index.
		// The thing that got removed/replaced gets returned, so you
		// could print/save it if you wanted to.

		// Delete items in an ArrayList using the REMOVE command
		// It just deletes the entire element where something
		// was stored. Everything else shifts over as the array shrinks.
		names.remove(1);
		// Just like with the set command, you could print or save the value
		// that gets removed, but you don't have to.

		// Access values using the GET command
		System.out.println(names.get(0));
		names.set(0, names.get(0) + " is the worst");

		// printing the name of the ArrayList will automatically
		// print each item (no loops needed, hooray!)
		System.out.println(names);

		// length of an ArrayList is "size" instead of "length"
		System.out.println(names.size());

		// Looping through an ArrayList is very similar to arrays
		// Example: print the name of any string that contains an "a"
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).contains("a"))
				System.out.println(names.get(i));
		}

		/*
		 * PRACTICE:
		 * 1) Create an ArrayList of integers. Note that you need to
		 * write the word Integer instead of int, like this:
		 * ArrayList<Integer> listName = new ArrayList<Integer>();
		 * 
		 * 2) One line at a time, add these numbers to the list 5, 7, 8, 4, 1, 6.
		 * 
		 * 3) Ask the user for an integer, and replace the element at
		 * index 0 with whatever they type.
		 * 
		 * 4) Use a for loop to remove all integers that are EVEN.
		 * 
		 * 5) Print the arrayList.
		 */

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(4);
		nums.add(1);
		nums.add(6);

		System.out.println("Enter an int");
		int remove = keyboard.nextInt();
		nums.set(0, remove);

		for (int i = nums.size() - 1; i > 0; i--) {
			if (nums.get(i) % 2 == 0) {
				nums.remove(i);
			}
		}

		System.out.println(nums);
	}
}