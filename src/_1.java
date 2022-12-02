import java.util.HashMap;

public interface _1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15},9));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
