import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {

        int[] nums = {9, 4, 1, 19, 12};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("before sorting");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();

            for (int num : nums) {
                System.out.print(num + " ");
            }

//        int result = linearSearch(nums, target);
//
//        if(result != -2)
//
//        System.out.println("Element found at Index : " + result);
//
//        else
//            System.out.println("Element not found");
//
//
//
//    }
//
//    public static int linearSearch(int[] nums, int target) {
//
//        for (int i=0;i<nums.length; i++){
//            if(nums[i] == target)
//                return i;
//        }
//        return -2;

        }
    }
}