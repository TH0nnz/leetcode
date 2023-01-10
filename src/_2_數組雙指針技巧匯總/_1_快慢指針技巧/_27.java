package _2_數組雙指針技巧匯總._1_快慢指針技巧;

public class _27 {
    public static void main(String[] args) {
        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
