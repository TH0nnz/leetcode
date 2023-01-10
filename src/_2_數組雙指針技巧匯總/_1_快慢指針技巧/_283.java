package _2_數組雙指針技巧匯總._1_快慢指針技巧;

public class _283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {

        int slow = 0, fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (; slow < nums.length; slow++) {
            nums[slow]=0;
        }
        System.out.println(nums.toString());
    }
}
