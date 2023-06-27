import java.util.Arrays;

public class movingZeroes {
    public static void moveZeroes(int[] nums) {
        int idx = 0; // Index to track the position for non-zero elements

        // Move non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[idx] = num;
                idx++;
            }
        }

        // Fill the remaining positions with zeroes
        while (idx < nums.length) {
            nums[idx] = 0;
            idx++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

    }
}
