import java.util.*;

public class Practice6_1 {
    public static void main(String[] args) {
        // check out this shortcut for adding multiple elements to an ArrayList!
        // (this shortcut is not something you will be tested on)
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(8, 10, 11, 14, 19, -8, -10, 1, 7));

        // here is another sample ArrayList, this time made up of Strings:
        ArrayList<String> words = new ArrayList<String>();
        words.addAll(Arrays.asList("four", "score", "and", "seven", "years", "ago"));

        // here is an ArrayList of single-letter Strings:
        ArrayList<String> letters = new ArrayList<String>();
        letters.addAll(Arrays.asList("a", "b", "b", "a", "c", "c", "d"));

        System.out.println(merge(nums, nums));
    }

    public static ArrayList<Integer> minToFront(ArrayList<Integer> list) {
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        int min = list.get(minIndex);
        list.remove(minIndex);
        list.add(0, min);
        return list;
    }

    public static ArrayList<String> removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static ArrayList<String> doubleList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<Integer>();
        merged.addAll(list1);
        merged.addAll(list2);

        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < merged.size(); i++) {
            int minIndex = 0;
            for (int j = 0; j < merged.size(); j++) {
                if (merged.get(j) < merged.get(minIndex)) {
                    minIndex = j;
                }
            }
            sorted.add(merged.get(minIndex));
            merged.remove(minIndex);
        }
        return sorted;
    }
}
