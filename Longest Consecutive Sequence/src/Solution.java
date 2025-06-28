import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                maxStreak = Math.max(maxStreak, streak);
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println(sol.longestConsecutive(nums1));
        System.out.println(sol.longestConsecutive(nums2));
    }
}
