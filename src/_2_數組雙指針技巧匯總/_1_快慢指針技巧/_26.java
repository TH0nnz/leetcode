package _2_數組雙指針技巧匯總._1_快慢指針技巧;

public class _26 {
    public static void main(String[] args) {
      int[]  nums={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                // 維護 nums[0..slow] 無重複
                nums[slow] = nums[fast];
            }
            fast++;
        }
        // 數組長度為索引 + 1
        return slow + 1;
    }
}
