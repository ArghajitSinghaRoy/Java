import java.util.HashSet;

public class DuplicateFinder {
    public static Integer findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num; // Found a duplicate
            }
        }

        return null; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3, 5, 6, 2 };
        Integer duplicate = findDuplicate(nums);

        if (duplicate != null) {
            System.out.println("Duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}