public class Bubble_Sort {
     public static int[] bubble_sort(int[] nums) {
          int len = nums.length;
          for (int i = 0; i < len; i++)
               for (int j = i + 1; j < len; j++)
                    if (nums[i] >= nums[j]) {
                         int temp = nums[i];
                         nums[i] = nums[j];
                         nums[j] = temp;
                    }
          return nums;
     }

     public static void print_nums(int[] nums) {
          for (int i = 0; i < nums.length; i++)
               System.out.print(nums[i] + " ");
     }

     public static void main(String[] args) {
          int[] nums = { 1, 8, 9, 2, 4, 10, 3, 5 };
          print_nums(bubble_sort(nums));
     }

}
