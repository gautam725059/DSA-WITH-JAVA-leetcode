import java.util.*;

public class containtDuplicate {
    public boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Check duplicate within k distance
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Maintain window of size k
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
      public static void main(String[] args) {
        containtDuplicate obj = new containtDuplicate();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = obj.containsDuplicate(nums, k);

        System.out.println("Contains duplicate within k distance: " + result);
    }
}