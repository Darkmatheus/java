public class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int m = l + (r - l) / 2;

            if (nums[m] < target){
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else{
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = solution.search(array, 5);
        System.out.println("Indice do target: "+index);

    }
}
